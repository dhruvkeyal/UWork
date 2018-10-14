package com.uwork.uwork3;



    public class People {
        int image;
        String name;
        String jobDescription;

        public People(int img,String nm, String jd){
            image=img;
            name=nm;
            jobDescription=jd;
        }

        @Override
        public String toString() {
            return super.toString();
        }

        public int getImage() {
            return image;
        }

        public String getName() {
            return name;
        }

        public String getJobDescription() {
            return jobDescription;
        }
    }

