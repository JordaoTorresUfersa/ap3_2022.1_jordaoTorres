 pacote  com . br . ap3 . jordaoTorres ;

 classe  pública Pessoa {
     nome da string  privada ;
     idade int  privada ;

    public  String  getNome (){
        devolva  isso . nome ;
    }

    public  void  setNome ( String  nome ){
        isso . nome = nome ;
    }

    public  int  getIdade (){
        devolva  isso . idade ;
    }

    public  void  setIdade ( int  idade ){
        isso . idade = idade ;
    }

    @ Substituir
    public  String  toString () {
        return  "Nome da Pessoa:" + this . nome + "/n" +
                "Idade da Pessoa: " + isto . idade ;
    }
}