class matematika{
	
	//Class Matematika
	
	float data1;
	float data2;
	
	matematika(){
		data1 = 0;
		data2 = 0;
	}
	
	matematika(float angka1, float angka2){
		data1 = angka1;
		data2 = angka2;
	}
	
	float pertambahan(){
		return data1 + data2;
	}
	
	float pengurangan(){
		return data1-data2;
	}
	
	float perkalian(){
		return data1*data2;
	}
	
	float pembagian(){
		return data1/data2;
	}
	
	void gantiAngka(float angka1, float angka2){
		data1 = angka1;
		data2 = angka2;
	}
}