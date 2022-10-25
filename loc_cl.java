public class Places{
	public static void main (String args[]){
		double arr [] [] =new double [1211][6];
		int u=2;
		int t=0;
		while(!StdIn.isEmpty()){
		arr[t][0]=StdIn.readDouble(); //getting the place name
		arr[t][1]=StdIn.readDouble();  //getting the area num
		arr[t][2]=StdIn.readDouble();  //getting the residents num
		arr[t][3]=StdIn.readDouble();  //getting x coordinate
		arr[t][4]=StdIn.readDouble();  //getting y coordinate
		arr[t][5]=0;
		t++;
		}
		for (int i=0;i<1211;i++){
			if(arr[i][5] == 0){
				if(i==0){
					if(arr[i][2]>2000){
					arr[i][5]=1;
					}else{
						for(int j=0; j<1211;j++){
							if(j!=i && arr[j][2]<2000 && arr[j][5]==0){
								if(Math.abs(arr[j][3]-arr[i][3])<250 & Math.abs(arr[j][4]-arr[i][4])<250){
								arr[j][5]=u;
								arr[i][5]=u;
								}
							}
						}
					u++;
					}
				}
				if(i>0){
					if(arr[i][1] == arr[i-1][1]){
						if (arr[i][2]>2000){
						arr[i][5]=1;
						}else{
							for(int j=0; j<1211;j++){
								if(i!=j && arr[j][2]<2000 && arr[j][5]==0){
									if(Math.abs(arr[j][3]-arr[i][3])<250 & Math.abs(arr[j][4]-arr[i][4])<250){
									arr[j][5]=u;
									arr[i][5]=u;
									}
								}
							}
						u++;
						}
					}else{
					u=u+10;
					if (arr[i][2]>2000){
						arr[i][5]=1;
						}else{
							for(int j=0; j<1211;j++){
								if(i!=j && arr[j][2]<2000 && arr[j][5]==0){
									if(Math.abs(arr[j][3]-arr[i][3])<250 & Math.abs(arr[j][4]-arr[i][4])<250){
									arr[j][5]=u;
									arr[i][5]=u;
									}
								}
							}
						u++;
						}
					}
				}
			}
		}
		for(int i=0; i<1211;i++){
			if(arr[i][5]==0){
				for( int j=0;j<1211;j++){
					if(arr[j][5]==0 && arr[j][1]==arr[i][1]){
						arr[i][5]=u;
						arr[j][5]=u;
					}
				}
			u++;
			}
		}
		for(int i=0; i<1211;i++){
			for (int j=0;j<6;j++){
				StdOut.print( arr[i][j]+ " " );
			}
		StdOut.println();
		}
	}
}
