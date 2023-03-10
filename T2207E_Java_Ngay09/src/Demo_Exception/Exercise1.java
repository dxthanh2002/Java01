package Demo_Exception;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tran Manh Truong
 */
public class Exercise1 {
    public static void main(String[] args)
    {
        //demo lỗi do truy cập vào thuộc tính của biến null (chưa được gán đối tượng)
        String s;
        try{
            
            System.out.println("Do dai chuoi s la:" + s.length());
        }
        catch(Exception e)
        {
            System.out.println("Co loi xay ra");
        }
        System.out.println("Ket thuc");
    }
}
