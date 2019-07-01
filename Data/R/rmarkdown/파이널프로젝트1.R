install.packages("caret")
install.packages("tree")
install.packages("rpart")
install.packages("neuralnet")
install.packages("ROCR")
install.packages("NeuralNetTools")


library(shiny)
library(ggplot2)
library(tidyverse)
library(caret)
library(tree)
library(rpart)
library(dplyr)
library(neuralnet)
library(nnet)
library(caret)
library(ROCR)
library(devtools)
library(NeuralNetTools)


source_url('https://gist.githubusercontent.com/Peque/41a9e20d6687f2f3108d/raw/85e14f3a292e126f1454864427e3a189c2fe33f3/nnet_plot_update.r')

jeju_data <- read.csv(file = "C:/Users/daily/Desktop/FinalProject/FinalProject/jeju_financial_life_data.csv")

summary(jeju_data)

rpart_test <- rpart(avg_credit_rat~. , data = jeju_data)
plot(rpart_test)
text(rpart_test)


jeju_dt_data <- jeju_data %>% filter(jeju_data$medium_resid_rat >= 0)
summary(jeju_dt_data)

rpart_test <- rpart(avg_credit_rat~. , data = jeju_dt_data)

plot(rpart_test)
text(rpart_test)


## ?šŒê·€ë¶„ì„ ë§Œë“¤?–´ë³´ì ##
test_l <-lm(data = jeju_dt_data, avg_income~.) 
test_l
summary(test_l)
plot(test_l)
abline(out,col="red")




  
######## ? „ì²˜ë¦¬?‘?—… ##########
jun <- jeju_dt_data[jeju_data$medium_resid_rat >= -100, ]
jun1 <- jeju_dt_data[jeju_data$medium_resid_rat >= -100, ]
jun <- jun[,-c(1,2,3,4)]
jun <- jun[,-c(4)]
jun <- jun[,-c(13)]
jun <- jun[,-c(11)]
jun


jun <- select(jun,medium_resid_rat, age, job_other, sex, avg_debt_credit,vehicle_own_rat,job_public,job_none,job_self,job_profession,avg_credit_rat)
jun

test_ll <- lm(data=jun, avg_credit_rat~.)
test_ll_1 <- lm(avg_credit_rat~1,data=jun )

summary(test_ll)
#plot(test_ll)

#abline(out,col="red")


#################
fit.forward <- step(test_ll_1, scope=list(lower=test_ll_1,upper=test_ll),direction="forward")
summary(fit.forward)


#fit.backward <- step(test_ll, scope = list(lower = test_ll_1, upper = test_ll), direction = "backward")
#summary(fit.backward)



###################


##?‹ ê²½ë§ë¶„ì„##
install.packages("nnet")
library(nnet)

model.nnet <- nnet(avg_credit_rat ~ ., data = jun, size = 3, decay = 5e-04)
summary(model.nnet)

pre<-predict(model.nnet, type = "class",jun)
pre
###


#test_ll <- lm(data=jun, avg_credit_rat ~ avg_debt_deposit)
go0531 <- lm(data= jun1, avg_credit_rat ~ avg_income)
summary(go0531)


##?°?´?„°? •ê·œí™”
junggyu<- cbind(scale(jun1))
summary(junggyu)
m <- nnet(avg_credit_rat~. , data=jun1, size=5, type="class")
summary(m)
model.mnet <- nnet(avg_credit_rat~. , data=junggyu, size=2, type="class", decay = 5e-04)
summary(model.mnet)
predicted <- predict(model.nnet, junggyu, type = "class")

iris <- read_csv("http://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data", col_names = FALSE) 

# 1.2. ?°?´?„°?”„? ˆ?„?„ ?–‰? ¬ë¡? ë³€?™˜ -------------------
iris[,5] <- as.numeric(as.factor(unlist(iris[,5]))) -1
iris <- as.matrix(iris)
dimnames(iris) <- NULL

iris_x <- normalize(iris[,1:4])
iris_x <- scale(iris[,1:4])
iris_mat <- cbind(iris_x, iris[,5])
head(iris_mat)

ind <- sample(2, nrow(iris_mat), replace=TRUE, prob=c(0.67, 0.33))

### ëª¨í˜• ?„¤ê³„í–‰? ¬
iris.training <- iris_mat[ind==1, 1:4]
iris.test <- iris_mat[ind==2, 1:4]

### ëª¨í˜• ?˜ˆì¸¡ë?€?ˆ˜
iris.trainingtarget <- iris_mat[ind==1, 5]
iris.testtarget <- iris_mat[ind==2, 5]

### One-Hot ?¸ì½”ë”©: ?›ˆ? ¨?˜ˆì¸¡ë?€?ˆ˜
iris.trainLabels <- to_categorical(iris.trainingtarget)

### One-Hot ?¸ì½”ë”©: ê²€ì¦ì˜ˆì¸¡ë?€?ˆ˜
iris.testLabels <- to_categorical(iris.testtarget)


set.seed(777)
### 3.2.1. ëª¨í˜• ì´ˆê¸°?™”
model <- keras_model_sequential()

### 3.2.2. ëª¨í˜•?— ê³„ì¸µ ì¶”ê?€

# 4 inputs -> [8 hidden nodes] -> 3 outputs
model %>% 
  layer_dense(units = 8, activation = 'relu', input_shape = c(4)) %>% 
  layer_dropout(rate = 0.5) %>% 
  layer_dense(units = 3, activation = 'softmax')

### 3.2.3. ëª¨í˜• ?‚´?´ë³´ê¸°
summary(model)


model %>% compile(
  loss = 'categorical_crossentropy',
  optimizer = 'adam',
  metrics = 'accuracy'
)

### 3.2.5. ëª¨í˜• ? ?•©
model %>% fit(
  iris.training, 
  iris.trainLabels, 
  epochs = 500, 
  batch_size = 5,
  validation_split = 0.1
)

### 3.2.6. ? ?•©?œ ëª¨í˜• ?‹œê°í™”
history <- model %>% fit(
  iris.training, 
  iris.trainLabels, 
  epochs = 500,
  batch_size = 5,
  validation_split = 0.1
)

listviewer::jsonedit(history, model="view")




data<-iris
scale.data<-data.frame(lapply(data[,1:4], function(x) scale(x)))
scale.data
scale.data$Species<-data$Species
index<-sample(1:nrow(scale.data),round(0.75*nrow(scale.data)),replace=FALSE)
clust.train<-scale.data[index,]
clust.test<-scale.data[-index,]

jun1
library(caret)
set.seed(2549) #reproducability setting
intrain<-createDataPartition(y = jun1$avg_credit_rat, p=0.7, list=FALSE) 
train<-df[intrain, ]
test<-df[-intrain, ]

############################
## 2019.06.03
##################
jeju_data
summary(jeju_data)
jun1
summary(jun1)




####?ƒê´€ë¶„ì„?„?•´ë³´ì####
install.packages("UsingR")
library(UsingR)
cor.test(jun1$medium_resid_rat,jun1$avg_credit_rat)
cor.test(jun1$vehicle_own_rat,jun1$avg_credit_rat)
cor.test(jun1$age,jun1$avg_credit_rat)
cor.test(jun1$avg_spend,jun1$avg_credit_rat)
cortest <- lm(avg_credit_rat~medium_resid_rat, data = jun1)
plot(avg_credit_rat~medium_resid_rat, data = jun1)
summary(cortest)

############
'
?ƒê´€ë¶„ì„?˜ ê²½ìš°?—?Š” ?˜„?¬ ?“±ê¸‰ì´ ?¼? •?•˜ê²? ?ˆ«?ë¡? ?˜?–´?ˆê¸? ?•Œë¬¸ì— ?–´?Š? •?„ê¹Œì?€?Š” ê°€?Š¥?•˜ì§€ë§? ?•œê³„ì ?´ ì¡´ì¬?•œ?‹¤.
?´ë¥? ?™•?¸?•˜ê¸? ?œ„?•´?„œ plot(avg_credit_rat ~ medium_resid_rat, data = jun1 ?„ ?‚¬?š©?•˜ë©? ?œ?‹¤.)
'
test1<-lm(avg_credit_rat~medium_resid_rat, data = jeju_data)
wholetest11 <- cor.test(jeju_data$avg_spend, jeju_data$avg_credit_rat)
wholetest11
sampletest1 <- cor.test(jun1$avg_spend, jun1$avg_credit_rat)
sampletest1
test11



library(randomForest)
rf <- randomForest(avg_credit_rat ~ . , data=jeju_data, ntree=100)
jun1_ <- jeju_data
jun1_
jun1_ <- jun1_[,-c(1,2,3,4)]
jun1_ <- jun1_[,-c(4)]
jun1_ <- jun1_[,-c(13)]
jun1_ <- jun1_[,-c(11)]
jun1_
rf <- randomForest(avg_credit_rat ~ . , data = jun1_, ntree = 500)
rf
rf1 <- randomForest(avg_credit_rat ~ . , data = jeju_data, ntree = 500)
rf1

##decision tree###

set.seed(2000) #reproducability setting
intrain<-caret::createDataPartition(y=jeju_data$avg_credit_rat, p=0.7, list=FALSE)

train<-jeju_data[intrain, ]
test<-jeju_data[-intrain, ]



library(tree)
##tree?Š” ë²„ì „ ?—…?°?´?Š¸ê°€ ?•ˆ?˜?„œ ë¶ˆê?€?Š¥
library(rpart)
rpartmod<-rpart(avg_credit_rat~. , data=jun1_, method="class")
plot(rpartmod)
text(rpartmod)

printcp(rpartmod)
plotcp(rpartmod)

ptree<-prune(rpartmod, cp= rpartmod$cptable[which.min(rpartmod$cptable[,"xerror"]),"CP"])
plot(ptree)
text(ptree)

rpartpred<-predict(ptree, test, type='class')
confusionMatrix(rpartpred, table(test$avg_credit_rat))
##?—¬ê¸°ì„œë§‰í˜

library(caret)


### party decision tree ###

library(party)
partymod<-ctree(avg_credit_rat~., data=jeju_data_party)
plot(partymod)

jeju_data_party <- jeju_data[,c(5,6,14,16,18,19,24)]

partymod<-ctree(avg_credit_rat~., data=jeju_data_party)
plot(partymod)

partypred<-predict(partymod, test)
confusionMatrix(partypred, jeju_data_party$avg_credit_rat)


set.seed(2549) #reproducability setting
intrain<-createDataPartition(y = jeju_data_party$avg_credit_rat, p=0.7, list=FALSE) 
train<-jeju_data_party[intrain, ]
test<-jeju_data_party[-intrain, ]
A <- ctree_control(maxdepth=20)
B <- ctree(avg_credit_rat ~ . , data = jeju_data_party, controls = A)
plot(B, compress=TRUE)


###############################
? „ì²˜ë¦¬?•œë²ˆë”

jeju_data_second <- jeju_data[,c(5,6,14,16,18,19,24,27)]
jeju_data_second
second_rm <- lm(data=jeju_data_second,avg_credit_rat ~.)
second_rm
summary(second_rm)
plot(second_rm)
abline(out,col="red")



####

test_second<-lm(avg_credit_rat~., data = jeju_data_second)
se_wt <- cor.test(jeju_data_second$avg_income, jeju_data$avg_credit_rat)
se_wt
sampletest1 <- cor.test(jeju_data_second$avg_spend, jeju_data_second$avg_credit_rat)
sampletest1






set.seed(1)
inTrain <- createDataPartition(y=jeju_data_second$avg_credit_rat, p=0.7, list=FALSE)
cb.train <- jeju_data_second[inTrain,]
cb.test <- jeju_data_second[-inTrain,]



library(nnet)
model.nnet <- nnet(avg_credit_rat ~ ., data = train, size = 5, decay = 5e-04)

summary(model.nnet)
names(model.nnet)


model.nnet$wts
head(model.nnet$fitted.values)
head(model.nnet$residuals)
predicted <- predict(model.nnet, test)
predicted



actual <- test$avg_credit_rat
confusion.matrix <- table(actual, predicted)
confusion.matrix


plot.nnet(model.nnet)

garson(model.nnet)
confusionMatrix(predict(model.nnet, newdata=cb.test, type="class"), cb.test$avg_credit_rat)



nn_pred1 <- ROCR::prediction(predict(jeju_data_second, newdata=cb.test, type="raw"), cb.test$avg_credit_rat)
nn_model1.roc <- performance(nn_pred1, "tpr", "fpr")   # ROC-chart
plot(nn_model1.roc, colorize=TRUE)
