impor  jawa . menggunakan . ArrayDeque ;

 kelas  publik Utama {
    public  static  void  main ( String [] args ) {
        Tank  tigril = Tank baru  ( "Tigril" );
        Tank  franco = Tank baru  ( "Franco" , 2700 , 120 , 25 );
        Tank  akai = Tank baru  ( "Akai" , 2800 , 110 , 20 );

         Clint Marksman = Marksman baru  ( "Clint" );
        Marksman  lesley = Marksman baru  ( "Lesley" , 2400 , 150 , 14 );
        Marksman  bruno = Marksman baru  ( "Bruno" , 2500 , 140 , 17 );

        ArrayDeque < Penembak jitu > heroMarksman = new  ArrayDeque < Penembak jitu >();
        ArrayDeque < Tank > heroTank = new  ArrayDeque < Tank >();

        heroTank . tambahkan ( tigril );
        heroTank . addFirst ( franco );
        heroTank . tambahkan ( akai );

        pahlawan Penembak Jitu . tambahkan ( clint );
        pahlawan Penembak Jitu . tambahkan ( lesley );
        pahlawan Penembak Jitu . addFirst ( bruno );

        Sistem . keluar . println ( "Hero-hero Tank : " );
        untuk ( Tangki  tangki : heroTank ){
            tangki . infoHero ();
        }
        Sistem . keluar . println ( "" );
        Sistem . keluar . println ( "Hero-hero Marksman :" );
        for ( Marksman  mm : heroMarksman ){
            mm . infoHero ();
        }
    }
}
