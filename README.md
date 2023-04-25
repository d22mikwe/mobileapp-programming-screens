
# Rapport


Jag började med att skapa en knapp med en on click listener. När användaren trycker på knappen
så skapas en intent + en bundle som innehåller data. Denna bundle läggs till i intenten och skickas med 
till den nya activityn som startas.

```
Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                String name = "Mikael";
                String age = "23";
                String school = "HiS";

                Bundle extras = new Bundle();
                extras.putString("name", "Mikael");
                extras.putString("age", "23");
                extras.putString("school", "His");

                intent.putExtras(extras);

                startActivity(intent);
            }
        });
    }
```
Till sist extraherade jag datan från intenten/bundlen och lade upp datan i 3 olika textviews på acitivity 2 skärmen.
```
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String name = extras.getString("name");
        String age = extras.getString("age");
        String school = extras.getString("school");

        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(school);
        TextView textView2 = (TextView) findViewById(R.id.textView3);
        textView2.setText(name);
        TextView textView3 = (TextView) findViewById(R.id.textView4);
        textView3.setText(age);

    }
```


![](Screen%201.png)
![](Screen%202.png)


