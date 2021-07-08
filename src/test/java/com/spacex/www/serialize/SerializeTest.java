package com.spacex.www.serialize;

import org.junit.Test;

import java.io.*;
import java.net.URL;

public class SerializeTest {
    @Test
    public void serialize(){
        try {
            //序列化
            FileOutputStream fos= new FileOutputStream("Object.out");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            Student student=new Student("spacex","123",24);
            oos.writeObject(student);
            oos.flush();
            oos.close();
            //反序列化
            FileInputStream fis=new FileInputStream("Object.out");
            ObjectInputStream ois =new ObjectInputStream(fis);
            Student student1= (Student) ois.readObject();
            System.out.println(student1);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void filePath() throws IOException {
        //获取当前类的所在工程路径;
        File f = new File(this.getClass().getResource("/").getPath());
        System.out.println(f);
        //获取当前类的绝对路径；
        File f2 = new File(this.getClass().getResource("").getPath());
        System.out.println(f2);
        //获取当前类的所在工程路径;
        File directory = new File("");//参数为空
        String courseFile = directory.getCanonicalPath() ;
        System.out.println(courseFile);

        String xmlpath = this.getClass().getClassLoader().getResource("").getPath();
        System.out.println(xmlpath);
        //获取当前工程路径
        System.out.println(System.getProperty("user.dir"));

        System.out.println( System.getProperty("java.class.path"));
    }
}
