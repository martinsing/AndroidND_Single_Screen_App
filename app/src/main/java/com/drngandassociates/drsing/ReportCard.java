package com.drngandassociates.drsing;


public class ReportCard {

    private double biologyGrade;
    private double chemistryGrade;
    private double mathGrade;
    private double geographyGrade;
    private double frenchGrade;
    private double englishGrade;

    // Getters and Setters
    public double getBiologyGrade() {
        return biologyGrade;
    }

    public void setBiologyGrade(double biologyGrade) {
        this.biologyGrade = biologyGrade;
    }

    public double getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(double chemistryGrade) {
        this.chemistryGrade = chemistryGrade;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getGeographyGrade() {
        return geographyGrade;
    }

    public void setGeographyGrade(double geographyGrade) {
        this.geographyGrade = geographyGrade;
    }

    public double getFrenchGrade() {
        return frenchGrade;
    }

    public void setFrenchGrade(double frenchGrade) {
        this.frenchGrade = frenchGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    // Constructor for the Report Card

    public ReportCard(double biologyGrade, double chemistryGrade, double mathGrade, double geographyGrade, double frenchGrade, double englishGrade) {
        this.biologyGrade = biologyGrade;
        this.chemistryGrade = chemistryGrade;
        this.mathGrade = mathGrade;
        this.geographyGrade = geographyGrade;
        this.frenchGrade = frenchGrade;
        this.englishGrade = englishGrade;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "biologyGrade=" + biologyGrade +
                ", chemistryGrade=" + chemistryGrade +
                ", mathGrade=" + mathGrade +
                ", geographyGrade=" + geographyGrade +
                ", frenchGrade=" + frenchGrade +
                ", englishGrade=" + englishGrade +
                '}';
    }
}
