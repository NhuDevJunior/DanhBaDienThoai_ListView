package com.example.hancongnhu_day04;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterContact extends BaseAdapter {
    List<Contact> contactlist;

    public AdapterContact(List<Contact> contactlist) {
        this.contactlist = contactlist;
    }

    @Override
    public int getCount() {
        return contactlist.size();
    }

    @Override
    public Object getItem(int i) {
        return contactlist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        view=inflater.inflate(R.layout.item_contact,viewGroup,false);
        TextView tvname=view.findViewById(R.id.ivname);
        TextView tvstyle=view.findViewById(R.id.ivstyle);
        ImageView imgview=view.findViewById(R.id.ivicon);
        TextView tvdate=view.findViewById(R.id.ivdate);
        Contact contact=contactlist.get(i);
        tvname.setText(contact.getName());
        tvstyle.setText(contact.getStyle());
        tvdate.setText(contact.getDate());
        if(contact.icon==true)
        {
            imgview.setImageResource(R.drawable.callnhan_foreground);

        }
        else
        {
            imgview.setImageResource(R.drawable.callgui_foreground);

        }
        return view;
    }
}
