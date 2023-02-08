package Demo_Exception;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tran Manh Truong
 */
public class Exercise2 {
    public static void main(String[] args)
    {
        //demo lỗi do truy cập quá giới hạn của mảng
        int[] ary = new int[5];
        try{
            System.out.println("Phan tu thu 6 la: " + ary[5] );
        }
        catch(java.lang.ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Loi truy cap mang tai vi tri:" + e.getMessage());
        }
    }
}
