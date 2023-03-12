package sn.esmt.emploi.tools;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import sn.esmt.emploi.R;
import sn.esmt.emploi.config.UsersResponse;


public class MyAdapterUser extends BaseAdapter {

	private ArrayList<UsersResponse> users;
	private LayoutInflater myInflater;
	
	public MyAdapterUser(Context context, ArrayList<UsersResponse> users)
	{
		this.myInflater = LayoutInflater.from(context);
		this.users = users;
	}
	
	@Override
	public int getCount() {
		return this.users.size();
	}

	@Override
	public Object getItem(int arg0) {
		return this.users.get(arg0);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	public static class ViewHolder {
		TextView textnom;
		TextView textprenom;
		TextView textage;
		TextView textadresse;
		TextView textemail;
		TextView textniveauEtude;
		TextView texttelephone;
		TextView textexperienceProfesionnelle;
		TextView textspecialite;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		
		if (convertView == null)
		{
			convertView = myInflater.inflate(R.layout.listitem_user, null);
			holder = new ViewHolder();
			holder.textemail = (TextView) convertView.findViewById(R.id.txtemail);
			holder.textnom = (TextView) convertView.findViewById(R.id.txtnom);
			holder.textprenom = (TextView) convertView.findViewById(R.id.txtprenom);
			holder.textage = (TextView) convertView.findViewById(R.id.txtage);
			holder.textspecialite = (TextView) convertView.findViewById(R.id.txttspecialite);
			holder.textniveauEtude = (TextView) convertView.findViewById(R.id.txtniveauEtude);
			holder.textadresse = (TextView) convertView.findViewById(R.id.txtadresse);
			holder.texttelephone = (TextView) convertView.findViewById(R.id.txttelephone);
			holder.textexperienceProfesionnelle = (TextView) convertView.findViewById(R.id.txtexperienceProfessionnelle);

			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		holder.textemail.setText(users.get(position).getEmail());
		holder.textnom.setText(users.get(position).getNom());
		holder.textprenom.setText(users.get(position).getPrenom());
		holder.textage.setText(users.get(position).getAge());
		holder.textadresse.setText(users.get(position).getAdresse());
		holder.texttelephone.setText(users.get(position).getTelephone());
		holder.textspecialite.setText(users.get(position).getSpecialite());
		holder.textniveauEtude.setText(users.get(position).getNiveauEtude());
		holder.textexperienceProfesionnelle.setText(users.get(position).getExperienceProfessionnelle());



		return convertView;
		
	}

}
