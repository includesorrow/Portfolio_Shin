###################################################################
#
#   Building graphs with R
#
##################################################################


mtcars

str(mtcars)
mtcars$vs <- factor(mtcars$vs, levels=c(0,1), labels=c("V-shaped", "straight"))
mtcars$am <- factor(mtcars$am, levels=c(0,1), labels=c("automatic", "manual"))
str(mtcars)

attach(mtcars)
plot(wt, mpg)
abline(lm(mpg~wt))
title("Regression of MPG on Weight")
detach(mtcars)


#  3-2 A simple example

dose <- c(20,30,40,45,60)
drugA <- c(16,20,27,40,60)
drugB <- c(15, 18, 25, 31, 40)

plot(dose, drugA, type="b")


#  3-3  Graphic parameters
#  3-3-1  Symbols and lines

plot(dose, drugA)

opar <- par(no.readonly = TRUE)
par(lty=2, pch=17)
plot(dose, drugA, type="b")
par(opar)

plot(dose, drugA, type="b")

plot(dose, drugA, type="b", lty=3, lwd=3, pch=15, cex=2)


#  3-3-2  colors

plot(dose, drugA, type="b", col="red")

colors()
rainbow(7)

n <- 10
mycolors <- rainbow(n)
pie(rep(1,n), labels=mycolors, col=mycolors)



plot(mtcars$mpg)
plot(mtcars$mpg, type="b")

plot(mtcars$vs)
plot(mtcars$cyl)

plot(mtcars$wt, mtcars$mpg)
plot(mtcars$am, mtcars$mpg)
plot(mtcars$cyl, mtcars$mpg)


##############################################################

# 6-1 Bar plots

install.packages("vcd")
library(vcd)

Arthritis
str(Arthritis)
help("Arthritis")
summary(Arthritis)

counts <- table(Arthritis$Improved)
counts

barplot(counts, main="Simple Bar Plot",
        xlab="Improvement", ylab="Frequency")

barplot(counts, main="Horizontal Bar Plot",
        xlab="Frequency", ylab="Improvement", horiz=TRUE)


#  barplot(), plot() functions for factor vector

barplot(Arthritis$Improved, main="Simple Bar Plot",
        xlab="Improvement", ylab="Frequency")

plot(Arthritis$Improved, main="Simple Bar Plot",
     xlab="Improvement", ylab="Frequency")

# Stacked and Grouped Bar Plot

counts <- table(Arthritis$Improved, Arthritis$Treatment)
counts

barplot(counts, main="Stacked Bar Plot",
        xlab="Treatment", ylab="Frequency",
        col=c("red","yellow","green"), legend=rownames(counts))

barplot(counts, main="Stacked Bar Plot",
        xlab="Treatment", ylab="Frequency",
        col=c("red","yellow","green"), 
        legend=rownames(counts), beside=TRUE)


#  6-2 Pie Charts

slices <- c(10,12,4,16,8)
lbls <- c("US", "UK", "Aurstralia", "Germany", "France")
pie(slices, labels=lbls, main="Simple Pie Chart")

pct <- round(slices/sum(slices)*100)
lbls2 <- paste(lbls, " ", pct, "%", sep=" ")
pie (slices, labels=lbls2, col=rainbow(length(lbls2)),
     main="Pie Chart with Percentages")


# 6-3  Histograms

hist(mtcars$mpg)

hist(mtcars$mpg, breaks=12, col="red",
     xlab="Miles Per Gallon")

hist(mtcars$mpg, freq=FALSE, breaks=12, col="red")
lines(density(mtcars$mpg), col="blue", lwd=2)


# Box Plots

boxplot(mtcars$mpg, main="Box plot", ylab="Miles per Gallon")

boxplot(mpg ~ cyl, data=mtcars, main="Car Mileage Data",
        xlab="Number of Cyliners", ylab="Miles per Gallon")



# 11-1   Scatter plots

attach(mtcars)
plot(wt, mpg, main="Basic Scatter plot of MOG vs. Weights",
     xlab="Car Weight", ylab="Mile per gallon", pch=19)
abline(lm(mpg~wt), col="blue", lwd=2, lty=1)
lines(lowess(wt,mpg), col="red", lwd=2, lty=2)

# 11-1-1   Scatter plot matrices

pairs(~ mpg + disp + drat + wt, data=mtcars,
      main="Basic Scatter Plot Matrix")
detach(mtcars)

#
#  R in action : chater3  Getting started with graphs
# Graph and margin dimensions

opar <- par(no.readonly=TRUE)
par(pin=c(2,3))
par(lwd=2, cex=1.5)
par(cex.axis=.75, font.axis=3)
plot(dose, drugA, type="b", pch=19, lty=2, col="red")
plot(dose, drugB, type="b", pch=23, lty=6, col="blue", bg="green")
par(opar)


# Adding Text, customized axes, and legends

plot (dose, drugA, type="b", col="red", lty=2, pch=2, lwd=2,
      main="Clinical Trials for Drug A", sub="This is hypothetical data",
      xlab="Dosage", ylab="Drug Response", xlim=c(0,60), ylim=c(0,70))

title(main="My Title", col.main="red", sub="My Subtitle", col.sub="blue",
      xlab="My x label", ylab="My y label", col.lab="green", cex.lab=0.75)

#
#  3-4  Adding text, customized axes, and legends
#   Listing 3.2:   An Example of customer axes

x <- c(1:10)
y <- x
z <- 10/x
opar <- par(no.readonly=TRUE)
par(mar=c(5,4,4,8) + 0.1)

plot(x,y, type="b", pch=21, col="red", yaxt="n", ann=FALSE)
lines(x,z, type="b", pch=22, col="blue", lty=2)

axis(2, at=x, labels=x, col.axis="red", las=2)
axis(4, at=z, labels=round(z, digits=2), col.axis="blue", las=2, cex.axis=0.7)

mtext("y=1/x", side=4, line=3, col="blue", las=2)

title("An Example of Creative Axes", xlab="X values", ylab="Y=X")


#  Listing3.3:   Using Legends: Comparing drugA and drugB respose

opar <- par(no.readonly=TRUE)
par(lwd=2, cex=1.5, font.lab=2)

plot(dose, drugA, type="b", pch=15, lty=1, col="red", ylim=c(0,60),
     main="DrugA vs. DrugB", xlab="Dosage", ylab="Drug Response")

lines(dose, drugB, type="b", pch=17, lty=2, col="blue")

legend ("topleft", title="Drug Type", c("A","B"), 
        lty=c(1,2), pch=c(15,17), col=c("red","blue"))

par(opar)


#  3-4-5    Text annotations

attach(mtcars)
plot(wt, mpg, pch=18, col="blue", 
     main="Mileage vs. Car Weight", xlab="Weight", ylab="Mileage")
text(wt, mpg, row.names(mtcars), cex=0.5, pos=4, col="red")
detach(mtcars)


# 3-5   Combining graphs

attach(mtcars)
opar <- par(no.readonly=TRUE)
par(mfrow=c(2,2))

plot(wt, mpg, main="Scatterplot of wt vs. mpg")
plot(wt, disp, main="Scatterplot of wt vs. disp")
hist(wt, main="Histogram of wt")
boxplot(wt, main="Boxplot of wt")

par(opar)
detach(mtcars)

# 3.5.1   Creating a figure arrangement with fig parameter

attach(mtcars)
opar <- par(no.readonly=TRUE)
par(fig=c(0, 0.8, 0.,0.8))

plot(mpg, wt, xlab="Miles per Gallon", ylab="Car Weight")

par(fig=c(0,0.8,0.55,1), new=TRUE)
boxplot(mpg, horizontal=TRUE, axes=FALSE)

par(fig=c(0.65, 1, 0, 0.8), new=TRUE)
boxplot(wt, axes=FALSE)

mtext("Enhanced Scatterplot", side=3, outer=TRUE, line=-3)
par(opar)
detach(mtcars)



##############################################################################
#
#    ggplot2
#
##############################################################################

library(ggplot2)

ggplot(data=mtcars, aes(x=wt, y=mpg)) + geom_point() +
  labs(title="Automobile Data", x="Weight", y="Miles per Gallon")

ggplot(data=mtcars, aes(x=wt, y=mpg)) + 
  geom_point(pch=17, color="blue", size=2) +
  geom_smooth(method="lm", color="red", linetype=2) +
  labs(title="Automobile Data", x="Weight", y="Miles per Gallon")

# Grouping and facetting

mtcars$am <- factor(mtcars$am, levels=c(0,1), labels=c("Automatic", "Manual"))
mtcars$vs <- factor(mtcars$vs, levels=c(0,1), labels=c("V-Engine","Straight Engine"))

ggplot(data=mtcars, aes(x=hp, y=mpg), shape=cyl, color=cyl) +
  geom_point(size=3) + facet_grid(am~vs) +
  labs(title="Automobile data by Engine type", x="Horsepower", y="Mile per gallon")

# specifying the plot with geoms

library(lattice)

ggplot(singer, aes(x=height)) +geom_histogram()
ggplot(singer, aes(x=voice.part, y=height)) + geom_boxplot()

library(car)

ggplot(Salaries, aes(x=rank, y=salary)) +
  geom_boxplot(fill="cornflowerblue", color="black", notch=TRUE) +
  geom_point(position="jitter", color="blue", alpha=.5) +
  geom_rug(sides="l", color="black")


# Grouping by density, scatterplot

ggplot(data=Salaries, aes(x=salary, fill=rank)) + 
  geom_density(alpha=.3)

ggplot(data=Salaries, aes(x=yrs.since.phd, y=salary, color=rank)) +
  geom_point()  

ggplot(data=Salaries, aes(x=yrs.since.phd, y=salary, color=rank, shape=sex)) +
  geom_point()


# Various representation of bar charts

ggplot(Salaries, aes(x=rank, fill=sex)) +
  geom_bar(position="stack") +labs(title="position is stack")

ggplot(Salaries, aes(x=rank, fill=sex)) +
  geom_bar(position="dodge") +labs(title="position is dodge")

ggplot(Salaries, aes(x=rank, fill=sex)) +
  geom_bar(position="fill") +labs(title="position is fill")

ggplot(Salaries, aes(x=rank, fill=sex)) +geom_bar()
ggplot(Salaries, aes(x=rank)) + geom_bar(fill="red")
ggplot(Salaries, aes(x=rank, fill="green")) + geom_bar()


# Faceting

ggplot(data=singer, aes(x=height)) + geom_histogram() +
  facet_wrap(~voice.part, nrow=4)

ggplot(Salaries, aes(x=yrs.since.phd, y=salary, color=rank)) +
  geom_point() + facet_grid(.~sex)

ggplot(Salaries, aes(x=yrs.since.phd, y=salary, color=rank)) +
  geom_point() + facet_wrap(~sex)


ggplot(singer, aes(x=height, fill=voice.part)) +
  geom_density() + facet_grid(voice.part~.)


# Adding Smoothed lines

ggplot(data=Salaries, aes(x=yrs.since.phd, y=salary)) +
  geom_smooth() + geom_point()

ggplot(Salaries, aes(x=yrs.since.phd, y=salary, linetype=sex, shape=sex, color=sex)) +
  geom_smooth(method=lm, formula=y~poly(x,2), se=FALSE, size=1) + geom_point(size=2)



# Multiple Graphs per page

p1 <- ggplot(data=Salaries, aes(x=rank)) +geom_bar()
p2 <- ggplot(data=Salaries, aes(x=sex)) + geom_bar()
p3 <- ggplot(data=Salaries, aes(x=yrs.since.phd, y=salary)) + geom_point()

install.packages("gridExtra")
library(gridExtra)
grid.arrange(p1, p2, p3, ncol=3)


# Saving graphs

myplot <- ggplot(data=mtcars, aes(x=mpg)) +geom_histogram()
ggsave(file="mygraph.png", plot=myplot, width=5, height=4)

ggplot(data=mtcars, aes(x=mpg)) + geom_density()
ggsave(file="mygraph.pdf")

