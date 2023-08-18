package com.j3071.bean;

public class Dog {
      private int head;//被private修饰的成员属性 只能在本类中使用
      private String name;
      //提供一个方法返回当前对象的健康值
      public int getHead(){
            return this.head;
      }
      public void setHead(int head){
            if (head>=100){
            }else{
                  this.head=200;
            }
      }
      public String getName(){
            return this.name;
      }
      public void setName(String name){
            this.name=name;
      }
       public void show(){
      }

}
