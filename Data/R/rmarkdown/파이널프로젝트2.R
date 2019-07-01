jeju_data_party

write.csv(jeju_data_party,file = "C:/Users/daily/Desktop/파이널프로젝트_in R/jeju.csv")

avg_credit_rat <- jeju_data$avg_credit_rat
vehicle_own_rat <- jeju_data$vehicle_own_rat


jeju_data_party2 <- cbind(jeju_data_party, vehicle_own_rat)
jeju_data_party2 <- cbind(jeju_data_party2, avg_credit_rat)
jeju_data_party2 <- jeju_data_party2[,-c(7)]
jeju_data_party2

jeju_data_party <- jeju_data_party2

jeju_data_party
jeju_data_b <- jeju_data_party
jeju_data_b
jeju_data_b <- jeju_data_b[,-c(8)]

df <- jeju_data_party

set.seed(10422) #reproducability setting
intrain<-createDataPartition(y=df$avg_credit_rat, p=0.7, list=FALSE) 
train<-df[intrain, ]
test<-df[-intrain, ]

library(rpart)
rpartmod<-rpart(avg_credit_rat~. , data=train, method="class")
plot(rpartmod)
text(rpartmod)
printcp(rpartmod)
plotcp(rpartmod)

ptree<-prune(rpartmod, cp= rpartmod$cptable[which.min(rpartmod$cptable[,"xerror"]),"CP"])
plot(ptree)
text(ptree)
rpartpred<-predict(ptree, test, type='class')
confusionMatrix(rpartpred,test$avg_credit_rat)
rpartpred
test


### random forest ###
library(MASS) 
library(randomForest) 
library(caret)

set.seed(10000)
rf.fit = randomForest(avg_credit_rat ~ .
                      , data=jeju_data_party2, mtry = floor(sqrt(7)), ntree = 500, importance = T)

rf.fit



library(DataExplorer)
introduce(jeju_data_party2)
plot_intro(jeju_data_party2)
plot_str(jeju_data_party2)
plot_missing(jeju_data_party2)
plot_histogram(jeju_data_party2)
plot_density(jeju_data_party2)

plot_correlation (jeju_data_party2, type = 'continuous', 'jeju_data_party2')
plot_bar(jeju_data_party2)
create_report(jeju_data_party2)



arr_delay_df <- jeju_data_party2
plot_boxplot(arr_delay_df, by = "avg_credit_rat")
