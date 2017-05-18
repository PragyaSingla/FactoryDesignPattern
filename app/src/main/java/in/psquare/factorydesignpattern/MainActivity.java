package in.psquare.factorydesignpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewCars);
        final Adapter adapter = new Adapter();
        adapter.itemTapListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = recyclerView.getChildAdapterPosition(view);
                showCarInformation(adapter.cars[index]);
            }
        };
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    private void showCarInformation(CarFactory.Cars cars) {
        Car car = CarFactory.getCar(cars);
        Toast.makeText(this, "" + car.draw(), Toast.LENGTH_LONG).show();
    }

}


