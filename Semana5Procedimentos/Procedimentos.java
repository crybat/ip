class Procedimentos {

    // Prévio
    static char[] create(char c, int n)
    {
        char[] charSeq = new char[n];
        
        while (n > 0) {
            n--;
            charSeq[n] = c;
        }
        
        return charSeq;
    }
    
    static void fill(char c, char[] v)
    {
        for (int i = 0; i < v.length; i++) {
            v[i] = c;
        }
    }
    
    static void replace(char needle, char replace, char[] v)
    {
        for (int i = 0; i < v.length; i++) {
            if (needle == v[i])
                v[i] = replace;
        }
    }
    // /Prévio
    
    // Exercícios
    // a
	static char[] sequence(char c, int length)
	{
	    char[] sequence = new char[length];
	    
	    while (length > 0) {
	       length--;
	       sequence[length] = (char)((int) c + length);
	    }
	    
	    return sequence;
	}
	// b
	static void replaceFirstOccurrence(char needle, char replace, char[] v)
	{
	   for (int i = 0; i < v.length; i++) {
	       if (needle == v[i]) {
	           v[i] = replace;
	           return;
	       }
	   }
	}
	// c
	static void replaceLastOccurrence(char needle, char replace, char[] v)
	{
	   for (int i = v.length - 1; i >= 0; i--) {
	       if (needle == v[i]) {
	           v[i] = replace;
	           return;
	       }
	   }
	}
	// d
	static void shiftLeft(char[] v)
	{
	   for (int i = 1; i < v.length; i++) {
	       // guardar actual
           char c = v[i];
           // copiar anterior para a frente
           v[i] = v[i - 1];
           // copiar actual para trás
           v[i - 1] = c;
	   }
	}
	// e
	static void shiftRight(char[] v)
	{
	   for (int i = v.length - 1; i > 0; i--) {
	       // guardar anterior
	       char c = v[i - 1];
	       // copiar actual para trás
	       v[i - 1] = v[i];
	       // copiar anterior para frente
	       v[i] = c;
	   }
	}
	// f
	static void swap(int i, int j, char[] v)
	{
	   char c = v[i];
	   v[i] = v[j];
	   v[j] = c;
	}
	// g
	static void invert(char[] v)
	{
	   int half = v.length / 2;
	   
	   for (int i = 0; i < half; i++) {
	       swap(i, v.length - i - 1, v);
	   }
	}
	// h (Algoritmo de Baralhação)
	static int randomIndex(int index)
	{
	   return (int) (Math.random() * (index + 1));
	}
	
	static void fisherYates(char[] v)
	{
	   for (int i = v.length - 1; i > 1; i--) {
	       int ri = randomIndex(i);
	       swap(i, ri, v);
	   }
	}
	// /h
	// i (Algoritmo de ordenação)
	// https://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif
	static void bubbleSort(char[] v)
	{
        for (int i = v.length - 1; i > 0; i--)   
                 
            for (int j = 1; j <= i; j++)
            
                if (v[j - 1] > v[j])
                    swap(j, j - 1, v);
	}
	// /i
	// /Exercícios
	
	// Extra
	
	// / Extra
}

