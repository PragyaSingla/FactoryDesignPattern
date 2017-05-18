package in.psquare.factorydesignpattern;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by CH-E01006 on 5/16/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    CarFactory.Cars[] cars = CarFactory.values();
    View.OnClickListener itemTapListener;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View carListLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell, null);
        ViewHolder carListViewHolder = new ViewHolder(carListLayout);
        carListViewHolder.text.setOnClickListener(onclickListener);
        return carListViewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CarFactory.Cars car = cars[position];
        holder.text.setText(car.toString());
    }

    @Override
    public int getItemCount() {
        return cars.length;
    }


    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    private View.OnClickListener onclickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            itemTapListener.onClick((View) view.getParent());
        }
    };

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView text;

        public ViewHolder(View itemView) {
            super(itemView);
            text = (TextView) itemView.findViewById(R.id.textView);
        }
    }
}
