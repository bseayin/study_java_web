package com.xsz.arry;

public class Test {
    public static void main(String[] args) {
         RequestData<User> requestData=new RequestData<User>();
         User user=new User();
         user.setAge(12);
         user.setName("小明");
         requestData.setBody(user);

        RequestData<Job> requestData2=new RequestData<Job>();
        Job job=new Job();
        job.setTitle("软件工程师");
        requestData2.setBody(job);

        RequestData<String> requestData3=new RequestData<String>();
        requestData3.setBody("sdfds");
    }
}
