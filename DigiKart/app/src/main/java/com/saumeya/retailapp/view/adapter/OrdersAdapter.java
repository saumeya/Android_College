package com.saumeya.retailapp.view.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.widget.RecyclerView;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.saumeya.retailapp.R;
import com.saumeya.retailapp.model.CenterRepository;
import com.saumeya.retailapp.model.entities.Money;
import com.saumeya.retailapp.model.entities.Product;
import com.saumeya.retailapp.util.ColorGenerator;
import com.saumeya.retailapp.util.Utils;
import com.saumeya.retailapp.view.activities.ECartHomeActivity;

import com.saumeya.retailapp.view.fragment.MyCartFragment;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.saumeya.retailapp.view.customview.ItemTouchHelperViewHolder;
import com.saumeya.retailapp.view.customview.OnStartDragListener;
import com.saumeya.retailapp.view.customview.TextDrawable;

public class OrdersAdapter extends
        RecyclerView.Adapter<OrdersAdapter.ItemViewHolder> implements
        com.saumeya.retailapp.view.customview.ItemTouchHelperAdapter {

    private static OnItemClickListener clickListener;
    private final OnStartDragListener mDragStartListener;
    private ColorGenerator mColorGenerator = ColorGenerator.MATERIAL;
    private TextDrawable.IBuilder mDrawableBuilder;
    private TextDrawable drawable;
    private String ImageUrl;
    private List<Product> productList = new ArrayList<Product>();
    private Context context;

    public OrdersAdapter(Context context,
                               OnStartDragListener dragStartListener) {
        mDragStartListener = dragStartListener;

        this.context = context;

        productList = CenterRepository.getCenterRepository().getOrders();
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.order_product_list, parent, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(final ItemViewHolder holder, final int position) {
        holder.itemName.setText(productList.get(position).getItemName());

        holder.itemDesc.setText(productList.get(position).getItemShortDesc());

        String sellCostString = Money.rupees(
                BigDecimal.valueOf(Long.valueOf(productList.get(position)
                        .getSellMRP()))).toString()
                + "  ";

        String buyMRP = Money.rupees(
                BigDecimal.valueOf(Long.valueOf(productList.get(position)
                        .getMRP()))).toString();

        String costString = sellCostString + buyMRP;

        holder.itemCost.setText(costString, TextView.BufferType.SPANNABLE);

        Spannable spannable = (Spannable) holder.itemCost.getText();

        spannable.setSpan(new StrikethroughSpan(), sellCostString.length(),
                costString.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        mDrawableBuilder = TextDrawable.builder().beginConfig().withBorder(4)
                .endConfig().roundRect(10);

        drawable = mDrawableBuilder.build(String.valueOf(productList
                .get(position).getItemName().charAt(0)), mColorGenerator
                .getColor(productList.get(position).getItemName()));

        ImageUrl = productList.get(position).getImageURL();

        holder.quanitity.setText(CenterRepository.getCenterRepository()
                .getOrders().get(position).getQuantity());

        Glide.with(context).load(ImageUrl).placeholder(drawable)
                .error(drawable).animate(R.anim.base_slide_right_in)
                .centerCrop().into(holder.imagView);
        // Start a drag whenever the handle view it touched
        holder.imagView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (MotionEventCompat.getActionMasked(event) == MotionEvent.ACTION_DOWN) {
                    mDragStartListener.onStartDrag(holder);
                }
                return false;
            }
        });

       /* holder.addItem.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                CenterRepository
                        .getCenterRepository()
                        .getOrders()
                        .get(position)
                        .setQuantity(
                                String.valueOf(

                                        Integer.valueOf(CenterRepository
                                                .getCenterRepository().getOrders()
                                                .get(position).getQuantity()) + 1));

                holder.quanitity.setText(CenterRepository.getCenterRepository()
                        .getOrders().get(position).getQuantity());

                Utils.vibrate(context);

                ((ECartHomeActivity) context).updateCheckOutAmount(
                        BigDecimal.valueOf(Long.valueOf(CenterRepository
                                .getCenterRepository().getOrders()
                                .get(position).getSellMRP())), true);

            }
        });*/

       /* holder.removeItem.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (Integer.valueOf(CenterRepository.getCenterRepository()
                        .getOrders().get(position).getQuantity()) > 2) {

                    CenterRepository
                            .getCenterRepository()
                            .getOrders()
                            .get(position)
                            .setQuantity(
                                    String.valueOf(

                                            Integer.valueOf(CenterRepository
                                                    .getCenterRepository()
                                                    .getOrders().get(position)
                                                    .getQuantity()) - 1));

                    holder.quanitity.setText(CenterRepository
                            .getCenterRepository().getOrders()
                            .get(position).getQuantity());

                    ((ECartHomeActivity) context).updateCheckOutAmount(
                            BigDecimal.valueOf(Long.valueOf(CenterRepository
                                    .getCenterRepository().getOrders()
                                    .get(position).getSellMRP())), false);

                    Utils.vibrate(context);
                } else if (Integer.valueOf(CenterRepository.getCenterRepository()
                        .getOrders().get(position).getQuantity()) == 1) {
                    ((ECartHomeActivity) context).updateItemCount(false);

                    ((ECartHomeActivity) context).updateCheckOutAmount(
                            BigDecimal.valueOf(Long.valueOf(CenterRepository
                                    .getCenterRepository().getOrders()
                                    .get(position).getSellMRP())), false);

                    CenterRepository.getCenterRepository().getOrders()
                            .remove(position);

                    if (Integer.valueOf(((ECartHomeActivity) context)
                            .getItemCount()) == 0) {

                        MyCartFragment.updateMyCartFragment(false);

                    }

                    Utils.vibrate(context);

                }

            }
        });*/
    }

    @Override
    public void onItemDismiss(int position) {

        ((ECartHomeActivity) context).updateItemCount(false);

        ((ECartHomeActivity) context).updateCheckOutAmount(
                BigDecimal.valueOf(Long.valueOf(CenterRepository
                        .getCenterRepository().getOrders().get(position)
                        .getSellMRP())), false);

        CenterRepository.getCenterRepository().getOrders().remove(position);

        if (Integer.valueOf(((ECartHomeActivity) context).getItemCount()) == 0) {

            MyCartFragment.updateMyCartFragment(false);

        }

        Utils.vibrate(context);

        // productList.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public boolean onItemMove(int fromPosition, int toPosition) {

        Collections.swap(productList, fromPosition, toPosition);
        notifyItemMoved(fromPosition, toPosition);
        return true;
    }

    @Override
    public int getItemCount() {
        return productList.size();

    }

  /*  public void SetOnItemClickListener(
            final OnItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }*/

  public void SetOnItemClickListener(OnItemClickListener onItemClickListener) {

        this.clickListener = onItemClickListener;
    }


    public interface OnItemClickListener {
        public void onItemClick(View view, int position);
    }

    /**
     * Simple example of a view holder that implements
     * {@link ItemTouchHelperViewHolder} and has a "handle" view that initiates
     * a drag event when touched.
     */
    public static class ItemViewHolder extends RecyclerView.ViewHolder
            implements ItemTouchHelperViewHolder, View.OnClickListener {

        // public final ImageView handleView;

        TextView itemName, itemDesc, itemCost, availability, quanitity,
                addItem, removeItem;
        ImageView imagView;

        public ItemViewHolder(View itemView) {
            super(itemView);
            // handleView = (ImageView) itemView.findViewById(R.id.handle);

            itemName = (TextView) itemView.findViewById(R.id.item_name);

            itemDesc = (TextView) itemView.findViewById(R.id.item_short_desc);

            itemCost = (TextView) itemView.findViewById(R.id.item_price);

            availability = (TextView) itemView
                    .findViewById(R.id.iteam_avilable);

            quanitity = (TextView) itemView.findViewById(R.id.iteam_amount);

            itemName.setSelected(true);

            imagView = ((ImageView) itemView.findViewById(R.id.product_thumb));

           // addItem = ((TextView) itemView.findViewById(R.id.add_item));

            //removeItem = ((TextView) itemView.findViewById(R.id.remove_item));

            itemView.setOnClickListener(this);
        }

        @Override
        public void onItemSelected() {
            itemView.setBackgroundColor(Color.LTGRAY);
        }

        @Override
        public void onItemClear() {
            itemView.setBackgroundColor(0);
        }

        @Override
        public void onClick(View v) {

            clickListener.onItemClick(v, getPosition());
        }
    }
}
