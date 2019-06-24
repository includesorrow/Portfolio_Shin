package Ex2;

public class Ex3_Array {
		  private int[] num1 = {100, 200};
	  private int[] num2 = {1000,2000,3000};
	  private int[][] test;
	  public Ex3_Array(){
	  //다차원 배열에서 1차원 배열의 수를 가변적으로 설정할 수 있다.
	  test = new int[2][];
	  test[0] = num1;
	  test[1] = num2;
	  }



	  public String getData(){
	  StringBuffer mysb = new StringBuffer();
/*	  for (int i = 0; i < test.length; i++){
	    for (int j = 0; j < test[i].length; j++){
	      mysb.append("test[").append(i).append("][]").append(j);
	      mysb.append("]:").append(test[i][j]).append("\n");
	    }
	  }

	  
	  /*
	   
	   */
	  for(int[] out : test) {
		  // 주소를 통해서 1차원 배열에 접근해서 읽어옴
		  for(int in : out) {
			  mysb.append(in).append("\n");
		  }
	  }
	  return mysb.toString();
	  }
	  public static void main(String[] args){
	    System.out.println(new Ex3_Array().getData());
	  }
	}


