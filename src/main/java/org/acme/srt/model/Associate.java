package org.acme.srt.model;

public class Associate {
    public String id;
    public String name;
    public String grade;
    public int segment;
    public int comparatio;
    public double salary;

    @Override
    public boolean equals(Object object)
    {
        boolean isTheSame = false;

        if (object != null && object instanceof Associate)
        {
            isTheSame = this.id == ((Associate) object).id;
        }

        return isTheSame;
    }
}
