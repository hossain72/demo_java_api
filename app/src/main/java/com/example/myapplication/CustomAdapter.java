package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private Context context;
    private List<User> userList;

    public CustomAdapter(Context context, List<User> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_user_info, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        User user = userList.get(position);
        holder.nameTV.setText("Name: " + user.getName());
        holder.principalAmountTV.setText("Principal Amount: " + user.getPrincipalAmount());
        holder.interestRateTV.setText("Interest Rate: " + user.getInterestRate());
        holder.tenureInMonthTV.setText("Tenure In Month: " + user.getTenureInMonth());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nameTV, principalAmountTV, interestRateTV, tenureInMonthTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTV = itemView.findViewById(R.id.nameTV);
            principalAmountTV = itemView.findViewById(R.id.principalAmountTV);
            interestRateTV = itemView.findViewById(R.id.interestRateTV);
            tenureInMonthTV = itemView.findViewById(R.id.tenureInMonthTV);
        }
    }
}
