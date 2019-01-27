                                      /* Simple Matrix Display */



class matrix
{
        public static void main(String args[])
        {
                int m[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

                System.out.print("Row=" + m.length + "\t" + "Column=" + m[0].length);

                System.out.print("\nMatrix :\n");

                for(int i=0;i<m.length;i++)
                {
                        for(int j=0;j<m[i].length;j++)
                        {
                                System.out.print(m[i][j] + "\t");
                        }
                        System.out.println();
                }
        }
}
