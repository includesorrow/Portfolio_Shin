##############################################################################
#
#    Handling Missing values, outliers
#
#############################################################################

#
# 비정상적 값의 정의: NA, NULL, inf, nan
#

x <- c(1,2,NA, Inf, NaN, 0, NULL)
x

x[1] / x[2]
x[1] / x[3]
x[1] / x[4]
x[1] / x[5]
x[1] / x[6]

mean(x)
mean(x, na.rm=T)

is.na(x[3])
is.nan(x[3])

is.nan(x[5])
is.na(x[5])

is.na(x)

z1 <- c(1, NULL, 3)
z1
mean(z1)
length(z1)

z2 <- c(1, NA, 3)
z2
mean(z2)
length(z2)

y <- NULL
y
is.null(y)
length(y)


#
#  7-1  결측치 정제하기 : 빠진 데이터를 찾아라
#

df <- data.frame(sex = c("M", "F", NA, "M", "F"),
                 score=c(5,4,3,4,NA))
df

is.na(df)
table(is.na(df))

is.na(df$sex)
table(is.na(df$sex))

is.na(df$score)
mean(df$score)

#   결측치 제거하기
install.packages("dplyr")
library(dplyr)

df %>% filter(is.na(score))
df %>% filter(!is.na(score))

df_nomiss <- df %>% filter(!is.na(score))
df_nomiss

mean(df_nomiss$score)
sum(df_nomiss$score)

# base 함수 이용하기 
df_nomissB <- df[!is.na(df$score), ]
df_nomissB
mean(df_nomissB$score)

df_nomiss2 <- na.omit(df)
df_nomiss2


#  na.rm 파라미터 이용하기 

mean(df$score, na.rm=T)
sum(df$score, na.rm=T)

exam <- read.csv("csv_exam.csv")
exam
exam[c(3,8,15),"math"] <- NA
exam

exam %>% summarise(mean_math=mean(math))

exam %>% summarise(mean_math = mean(math, na.rm=T))

exam %>% summarise(mean_math = mean(math, na.rm=T),
                   sum_math =sum(math, na.rm=T),
                   median_math = median(math, na.rm=T))

#  결측값 대체하기 

exam$math <- ifelse(is.na(exam$math), 55, exam$math)
exam

mean(exam$math)


# 7-2  이상치(outliers) 정제하기 

outlier <- data.frame(sex=c(1,2,1,3,2,1),
                      score=c(60,65,77,-50,110,88))
outlier

str(outlier)
outlier$sex <- factor(outlier$sex)

table(outlier$sex)
summary(outlier)

plot(outlier$sex)
boxplot(outlier$score)

outlier$sex <- ifelse(outlier$sex==3, NA, outlier$sex)
outlier$score[outlier$score < 0 | outlier$score > 100] <- NA
outlier

table(outlier$sex)
mean(outlier$score, na.rm=T)

#  극단적 값을 파악하기 

install.packages("ggplot2")
library(ggplot2)

hist(mpg$hwy, breaks=15)
boxplot(mpg$hwy)

#  상자그림 결과치를 확인하기 

m1 <- boxplot(mpg$hwy)
summary(m1)
str(m1)
m1
m1$stats


mpg$hwy <- ifelse(mpg$hwy < 12 | mpg$hwy > 37, NA, mpg$hwy)
table(is.na(mpg$hwy))

mpg %>% group_by(drv) %>% summarise(mean_hwy =mean(hwy, na.rm=T))


###################################################################
#
#   데이터 변환하기, 축소하기 
#
##################################################################

# scale 함수를 이용하여 정규화 분포로 변환하기

exam
exam %>% mutate(total=math+english+science) %>% arrange(desc(total))

math_s <- scale(exam$math)
df_math <- data.frame(exam$math, math_s)
df_math
mean(exam$math)
sd(exam$math)

english_s <- scale(exam$english)
science_s <- scale(exam$science)

score_s <- data.frame(math_s, english_s, science_s)
exam_s <- cbind(exam, score_s)

exam_s %>%
  mutate(total_s=math_s+english_s+science_s) %>%
  arrange(desc(total_s))

#  sample 함수

sample_1 <- sample(1:1000, 100)
sample_1
sort(sample_1)

titanic <- read.csv("Titanic_train.csv")
str(titanic)
View(titanic)

sample_size <- floor(0.75*nrow(titanic))

set.seed(1234)
titanic_s <- titanic[sample(1:nrow(titanic), sample_size), ]
str(titanic_s)

titanic_v <- titanic[-sample(1:nrow(titanic), sample_size), ]
titanic_v


