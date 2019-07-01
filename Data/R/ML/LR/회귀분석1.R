##############################################################################
#
#     통계적 분석 
#
###############################################################################

#   기술통계학 Descriptive Statistics

mtcars
str(mtcars)
head(mtcars)
summary(mtcars)

iris
str(iris)
head(iris)
summary(iris)

#
#   연속형 데이터의 그래프
#

#   히스토그램 (histogram)

mtcars$mpg

hist(mtcars$mpg)

opar <- par(no.readonly = TRUE)
par(mfrow=c(2,2))

hist(mtcars$mpg)
hist(mtcars$mpg, breaks=12, col="red",
     xlab="Miles Per Gallon")
hist(mtcars$mpg, freq=FALSE, breaks=12, col="red")
lines(density(mtcars$mpg), col="blue", lwd=2)
hist(mtcars$wt, xlim=c(1,6))

# histogram of iris data

hist(iris$Sepal.Length)
hist(iris$Sepal.Width)
hist(iris$Petal.Length)
hist(iris$Petal.Width)

par(opar)

# kernel density function

plot(density(mtcars$mpg))

#  입 줄기 그림 (Stem-and-Leaf plot)

stem(mtcars$mpg)
stem(mtcars$wt)


# box-plot

par(mfcol=c(1,2))
boxplot(mtcars$mpg, ylab="mpg")
boxplot(mtcars$wt, main="Box plot", ylab="weights")
boxplot(iris$Sepal.Length, main="Box plot of iris", ylab="Sepal.length")
boxplot(iris$Petal.Length, main="Box plot of iris", ylab="Petal.length")
par(opar)

#
#   이산형 데이터의 그래프 
#

install.packages("vcd")
library(vcd)

str(Arthritis)
head(Arthritis)
summary(Arthritis)

#  check sheet (frequency table)

counts <- table(Arthritis$Improved)
counts

# bar plots

barplot(counts, main="Simple Bar Plot", 
        xlab="Improvement", ylab="Frequency")
barplot(counts, main="Horizontal Bar Plot",
        xlab="Frequency", ylab="Improvement", horiz=TRUE)

cyl_counts <- table(mtcars$cyl)
cyl_counts
barplot(cyl_counts, main="Bar Plot of Number of Cylinders", xlab="Num of Cyl", ylab="Frequency")

# Creating bar plots with factor variables

plot(Arthritis$Improved, main="Bar Plot with factor variables",
     xlab="improved", ylab="Frequency")

plot(Arthritis$Improved)
plot(mtcars$cyl)

factor_cyl <- factor(mtcars$cyl)
plot(factor_cyl)

# Creating Pie charts

pie(counts, main="Pie Chart of Improved")
pie(cyl_counts, main="Number of cylinders")

#
#   기술통계량 산출 : descriptive statistics
#

summary(mtcars)
summary(iris)
summary(Arthritis)

# descriptive statistics for continuous variables

myvars <- c("mpg", "hp", "wt")
head(mtcars[myvars])

summary(mtcars[myvars])

sd(mtcars$mpg)
sd(mtcars$hp)
sd(mtcars$wt)

#  compute variance and standard deviation with sapply() function

sapply(mtcars[myvars], var)
sapply(mtcars[myvars], sd)
sapply(mtcars[myvars], mean)

# use statistical function to compute various statistics

quantile(mtcars$mpg, c(.1, .25, .5, .75, .9))
range(mtcars$mpg)
diff(range(mtcars$mpg))
scale(mtcars$mpg)

# 개인이 정의한 함수를 사용하기 

mystats <- function(x, na.omit=FALSE){
  if(na.omit)
    x <- x[!is.na(x)]
  m <- mean(x)
  n <- length(x)
  s <- sd(x)
  skew <- sum((x-m)^3/s^3)/n
  kurt <- sum((x-m)^4/s^4)/n-3
  return(c(n=n, mean=m, stdev=s, skew=skew, kurtosis=kurt))
}

ds1 <- sapply(mtcars[myvars], mystats)
str(ds1)
ds1

ds2 <- lapply(mtcars[myvars], mystats)
str(ds2)
ds2


#  compute descriptive statistics with contributed packages

install.packages("Hmisc")
install.packages("pastecs")
install.packages("psych")

library(Hmisc)
library(pastecs)
library(psych)

Hmisc::describe(mtcars[myvars])

stat.desc(mtcars[myvars])

psych::describe(mtcars[myvars])

#
#  7.2  범주형 변수의 분석  
#


library(vcd)
head(Arthritis)
str(Arthritis)

mytable1 <- table(Arthritis$Improved)
mytable1

mytable2 <- prop.table(Arthritis$Improved)
mytable2 <- prop.table(mytable1)
mytable2

mytable3 <- prop.table(mytable1)*100
mytable3


#
#   이변량(bivariate) 자료의 분석 
#

#  두 연속형 변수의 분석 scatter diagram 

plot(mtcars$wt, mtcars$mpg, main="Basic Scatter plot of MPG vs. Weight",
     xlab="Car weight (1000lbs)", ylab=" Miles per gallon")
abline(lm(mpg~wt, data=mtcars), col="red", lwd=2, lty=1)

# use scatterplot() function from the car package

install.packages("car")
library(car)

scatterplot(mtcars$mpg, mtcars$wt)

# Scatter-plot matrices

pairs(mtcars[myvars], main="Scatter plot matrix for mtcars")

scatterplotMatrix(mtcars[myvars], main="ScatterplotMatrix")

# 상관분석 (공분산, 상관계수)

cov(mtcars[myvars])
cor(mtcars[myvars])


#
# 범주형 변수와 연속형 변수의 분석 
#

# car 패키지 densityPlot()

densityPlot(iris$Sepal.Length, iris$Species, xlab="Sepal.Length")

densityPlot(mtcars$mpg, mtcars$cyl, xlab="Number of cylinders")
str(mtcars)

mtcars$cyl <- factor(mtcars$cyl)

densityPlot(mtcars$mpg, mtcars$cyl, xlab="Number of cylinders")

# box-plot with categorical variables

boxplot(mtcars$mpg~mtcars$cyl, xlab="number of cyliners", ylab="mpg")
boxplot(mtcars$mpg~mtcars$am, xlab="type of transmission", ylab="mpg")
boxplot(iris$Sepal.Length~iris$Species, xlab="Species", ylab="Sepal.Length")
boxplot(iris$Sepal.Width~iris$Species, xlab="Species", ylab="Sepal.width")

#  aggregate() 범주형 변수별로 연속형 변수의 기술통계량 요약 

aggregate(mtcars[myvars], by=list(am=mtcars$am), mean)
aggregate(mtcars[myvars], by=list(am=mtcars$am), sd)

aggregate(iris[,c(1,2,3,4)], by=list(Species=iris[,5]), mean)
aggregate(iris[,c(1,2,3,4)], by=list(Species=iris[,5]), sd)

# psych 패키지  describeBy() 사용한 방법 

describeBy(mtcars[myvars], mtcars$am)
describeBy(mtcars[myvars], mtcars$cyl)

describeBy(iris[,c(1,2,3,4)], iris$Species)


#
#  두 범주형 데이터 분석 
#

library(vcd)
head(Arthritis, 15)
str(Arthritis)

# table() 함수를 이용한  contingency table 생성 

counts <- table(Arthritis$Improved, Arthritis$Treatment)
counts

# 두 범주형 데이터의 막대그래프 작성

barplot(counts)
barplot(counts, main="Stacked bar plot", xlab="Treatment", ylab="Frequency",
        legend=rownames(counts))

barplot(counts, main="Grouped bar plot", xlab="Treatment", ylab="Frequency",
        legend=rownames(counts), beside=TRUE)


#  gmodels 패키지 CrossTable() 함수를 이용한 contingency table 작성  

library(gmodels)

CrossTable(Arthritis$Improved, Arthritis$Treatment)


##################################################
#
#  추정 통계학 :   Basic Interential Statistics
#
##################################################

#  compute confidence interval for one population mean

t.test(mtcars$mpg)

t.test(mtcars$mpg, conf.level=0.99)

t.test(mtcars$mpg, conf.level=0.9)

t.test(mtcars$mpg, alternative=c("greater"), conf.level=0.95)

#  Hypothesis test for one population mean

t.test(mtcars$mpg)

t.test(mtcars$mpg, mu=15)

t.test(mtcars$mpg, mu=20)

t.test(mtcars$mpg, mu=18)

t.test(mtcars$mpg, mu=18, alternative="greater")

t.test(mtcars$mpg, mu=18, alternative="less")


#  inferential statistics for one population proportion

#  200?? ��ǰ???? ?ҷ?ǰ?? 15?? ?߻??? ????

binom.test(15, 200)

binom.test(15, 200, p=0.1)

binom.test(15, 200, p=0.1, alternative="less")

binom.test(150, 2000, p=0.1)

binom.test(150, 2000, p=0.1, alternative="less")


#
#   Inferenctial statisticas for two population means
#

mpg_4 <- subset(mtcars, cyl==4, select=c(mpg))
mpg_6 <- subset(mtcars, cyl==6, select=c(mpg))

t.test(mpg_4, mpg_6)

t.test(mpg_4, mpg_6, conf.level = 0.99)

t.test(mpg_4, mpg_6, alternative="greater")

t.test(mpg_4, mpg_6, alternative="greater", mu=5)


# mpg 데이터 셋에서 두 집단 평균 t test

library(ggplot2)
library(dplyr)

str(mpg)

# compact와 suv 자동차의 city 연비 비교

table(mpg$class)

mpg_class <- mpg %>%
  filter(class %in% c("compact","suv")) %>% 
  select(class, cty)
mpg_class 

mpg %>%
  filter(class %in% c("compact","suv")) %>%
  ggplot(mapping=aes(x=class, y=cty)) + geom_boxplot()

mpg %>%
  filter(class %in% c("compact","suv")) %>%
  group_by(class) %>%
  summarise(mean_city_mpg = mean(cty), num_obs = n())

mpg_compact <- subset(mpg, class=="compact", select=c(cty), drop=T)
mpg_suv <- subset(mpg, class=="suv", select=c(cty), drop=T)

t.test(mpg_compact, mpg_suv)
t.test(mpg_compact, mpg_suv, alternative="greater", mu=5)

# 고급 휴발유와 일반 휴발유의 연비 비교 

table(mpg$fl)

mpg %>% 
  filter(fl %in% c("p", "r")) %>%
  ggplot(mapping=aes(x=fl, y=cty)) + geom_boxplot()

mpg %>%
  filter(fl %in% c("p", "r")) %>%
  group_by(fl) %>%
  summarise(mean_city_mpg = mean(cty), num_obs = n())

mpg_p <- subset(mpg, fl=="p", select=c(cty), drop=T)
mpg_r <- subset(mpg, fl=="r", select=c(cty), drop=T)

t.test(mpg_p, mpg_r)
t.test(mpg_p, mpg_r, alternative = "greater")


# Inferential statistics for correlations

cor(mtcars[myvars])
pairs(mtcars[myvars])

cor.test(mtcars$mpg, mtcars$wt)
cor.test(mtcars$mpg, mtcars$hp)

mtcars_4 <- subset(mtcars, cyl==4, select=c(mpg, wt))

cor.test(mtcars_4$mpg, mtcars_4$wt)

plot(mtcars$mpg, mtcars$wt)
plot(mtcars_4$mpg, mtcars_4$wt)

#
#  Hypothesis tests for categorical variables
# 

library(vcd)
library(gmodels)

str(Arthritis)

attach(Arthritis)
mytable1 <- table(Treatment,Improved)
mytable1
prop.table(mytable1, 2)

CrossTable(Treatment, Improved)

chisq.test(Treatment, Improved)


mytable2 <- table(Sex,Improved)
mytable2
prop.table(mytable2, 2)

CrossTable(Sex, Improved)

chisq.test(Sex, Improved)



