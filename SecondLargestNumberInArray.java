
int [] A = [13, 2, 3, 10, 100, 13];

Int largest1, largest2;

If (A.size() < 2) {
	return -1; //“Error less than 2 items in input array, so can’t find second largest”
}

Largest1 = A[0];
Largest2 = A[0];

For  (int I=0; I< A.size() A++) {
	

	if (A[I] > largest1) {
		largest2 = largest1;// exchange 
		largest1 = A[I];
	} else if (A[I] > largest2) {
		largest2 = A[I];
	}
	
}


System.out.print(largest2);




Value		L1		L2
13			13		13
2			13		13
3			13		13
10			13		13
100			100		13
13			100		13
50			100		50
150			150		100