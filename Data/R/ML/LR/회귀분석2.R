#################################################################
#
# Regression Models
#
#################################################################

# Exploration of Data Analysis

str(mtcars)
head(mtcars)

cor(mtcars[,1:9])
pairs(mtcars[,1:9])

cor(mtcars$mpg, mtcars$wt)
cor.test(mtcars$mpg, mtcars$wt)

# Example of simple regression model

lm(mpg ~ wt, data=mtcars)

fit_1 <- lm(mpg ~ wt, data=mtcars)
summary(fit_1)

fit_1
str(fit_1)

coefficients(fit_1)
fit_1$coefficients

confint(fit_1)
predict(fit_1)
plot(fit_1)

# Example of Women data

str(women)
head(women)
summary(women)

attach(women)
plot(height, weight, main="Scatter plot of women data set",
     xlab="height(inches)", ylab="weight(pounds)")

cor.test(height, weight)

fit_2 <- lm(weight~height)
abline(fit_2)

summary(fit_2)

women$weight
fitted(fit_2)
residuals(fit_2)
plot(fit_2)

# ploynomical regression

fit_3 <- lm(weight ~height + I(height^2))
summary(fit_3)

plot(height, weight, main="ploynomial regression",
     xlab="height", ylab="height")
lines(height, fitted(fit_3), col="red")
lines(height, fitted(fit_2), lty=2)

women$weight
fitted(fit_3)
residuals(fit_3)
plot(fit_3)

# Residual analysis
opar <- par(no.readonly = TRUE)
par(mfrow=c(2,2))

plot(fit_2)

plot(fit_3)

par(opar)
detach(women)


# Multiple regression models

pairs(mtcars[,c("mpg", "hp", "wt")])
cor(mtcars[,c("mpg","hp","wt")])

fit_4 <- lm(mpg ~ hp + wt)
summary(fit_4)
summary(fit_1)

install.packages("scatterplot3d")
library(scatterplot3d)

scatterplot3d(hp, wt, mpg, type="h", main="3D scatter plot")
s3d <- scatterplot3d(hp, wt, mpg, type="h", main="3D scatter plot")
s3d$plane3d(fit_4)

par(mfrow=c(2,2))
plot(fit_4)

# multiple regression with interactions

fit_5 <- lm(mpg ~ hp + wt + hp:wt)
summary(fit_5)

par(opar)

# Check interaction effect by effects plot

install.packages("effects")
library(effects)

plot(effect("hp:wt", fit_5))


# Mulicollinearity: VIF

install.packages("car")
library(car)
vif(fit_4)

fit_6 <- lm(mpg ~ cyl + disp + hp + drat + wt + qsec + vs + 
              am + gear + carb, data=mtcars)
summary(fit_6)

vif(fit_6)


# Comparing models

anova(fit_1, fit_4)

anova(fit_4, fit_6)

anova(fit_4, fit_5)

anova(fit_5, fit_6)

anova(fit_4, fit_5, fit_6)

AIC(fit_4, fit_5, fit_6)

#  Variable selection

library(MASS)

fit_7 <- stepAIC(fit_6, direction="backward")

summary(fit_7)
plot(fit_7)
vif(fit_7)

fit_8 <- stepAIC(fit_6, direction="both")
summary(fit_8)

library(leaps)
best_3 <- regsubsets(mpg ~ cyl + disp + hp + drat + wt + qsec + vs + 
                       am + gear + carb, data=mtcars, nbest=3)
plot(best_3, scale="adjr2")

best_3
summary(best_3)

# relative importance

zmtcars <- as.data.frame(scale(mtcars))
fit_8 <- lm(mpg ~ ., data=zmtcars)
round(coefficients(fit_8), digits=3)
round(coefficients(fit_6), digits=3)

fit_9 <- lm(mpg ~ wt + qsec + am, data=zmtcars)
round(coefficients(fit_9), digits=3)
round(coefficients(fit_7), digits=3)

install.packages("relaimpo")
library(relaimpo)

calc.relimp(fit_6)

calc.relimp(fit_7)

calc.relimp(fit_5)


###############################################################
#
#  Chapter 9 Analysis of Variance: aov()
#
###############################################################

str(iris)

attach(iris)
boxplot(Sepal.Length~Species)
aggregate(Sepal.Length, by=list(Species), FUN=mean)

# One way Analysis of Variance

fit_11 <- aov(Sepal.Length~Species)
summary(fit_11)

install.packages("gplots")
library(gplots)

plotmeans(Sepal.Length ~ Species, xlab="Species", ylab="Sepal.Length",
          main="Mean PLot with 95% CI")

plot(fit_11)

# Multiple Comparisons

TukeyHSD(fit_11)


# Two way factorial ANOVA

str(ToothGrowth)
ToothGrowth$dose <- factor(ToothGrowth$dose)
summary(ToothGrowth)

attach(ToothGrowth)
table(supp, dose)

aggregate(len, by=list(supp, dose), FUN=mean)

fit_12 <- aov(len ~ supp + dose)
summary(fit_12)

fit_13 <- aov(len ~ supp*dose)
summary(fit_13)

boxplot(len, dose, xlab="dose", ylab="Tooth length")
boxplot(len, supp, xlab="supplment type", ylab="Tooth length")

interaction.plot(dose, supp, len, type="b")
plot(effect("supp:dose", fit_13))


