                                               /* Matrix Substraction */


class matrixsub
{                                                                 
        public static void main(String args[])
        {
                int m1[][]={{1,2,3},{4,5,6},{7,8,9}};
                int m2[][]={{1,2,3},{4,5,6},{7,8,9}};

                int i,j;
                             
                int m3[][];
                m3=new int[3][3];

                if(m1.length!=m2.length)
                {
                        System.out.print("Substraction Not Possible");
                }
                else
                {

                        System.out.print("Matrix 1 :\n");

                        for(i=0;i<m1.length;i++)
                        {
                                for(j=0;j<m1[i].length;j++)
                                {
                                        System.out.print(m1[i][j] + "\t");
                                }
                                System.out.println();
                        }

                        System.out.print("\nMatrix 2 :\n");

                        for(i=0;i<m2.length;i++)
                        {
                                for(j=0;j<m2[i].length;j++)
                                {
                                        System.out.print(m2[i][j] + "\t");
                                }
                                System.out.println();
                        }


                        System.out.print("\nMatrix Substraction :\n");

                        for(i=0;i<m1.length;i++)
                        {
                                for(j=0;j<m1[i].length;j++)
                                {
                                        m3[i][j]=m1[i][j]-m2[i][j];
                                        System.out.print(m3[i][j] + "\t");
                                }
                                System.out.println();
                        }

                }

        }
}
