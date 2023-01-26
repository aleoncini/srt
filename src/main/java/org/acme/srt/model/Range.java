package org.acme.srt.model;

public class Range {
    public String title;
    public String grade;
    public double min;
    public double segmentOneTop;
    public double mid;
    public double segmentTwoTop;
    public double max;   

    @Override
    public boolean equals(Object object)
    {
        boolean isTheSame = false;

        if (object != null && object instanceof Range)
        {
            isTheSame = this.grade == ((Range) object).grade;
        }

        return isTheSame;
    }
}