package th.ac.kmutnb.doctor;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment {

//Explicit
    private String nameString ,surnameString , genderString, heightString, weightString,ageString, userString , passwordString ;



    public RegisterFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//    Create Toobar
        Toolbar toolbar = getView().findViewById(R.id.toolberRegister);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle(getString(R.string.new_register));
        ((MainActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);//ทำปุ่มย้อนกลับมุมบน
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true); //ทำปุ่มย้อนกลับมุมบน
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().popBackStack();
            }//เม็กตอดกดให้กลับ
        });
        setHasOptionsMenu(true);

    } //Main Method

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if(item.getItemId() == R.id.itemUpload) {
            checkValue();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void checkValue() {

//        Get Value From EditTxet
        EditText nameEditText = getView().findViewById(R.id.edtName);
        EditText surnameEditText = getView().findViewById(R.id.edtSurName);
        EditText userEditText = getView().findViewById(R.id.edtUesr);
        EditText passwordEdText = getView().findViewById(R.id.edtPassword);

        nameString = nameEditText.getText().toString().trim();
        surnameString = surnameEditText.getText().toString().trim();
        userString = surnameEditText.getText().toString().trim();
        passwordString = passwordEdText.getText().toString().trim();


        MyAlert myAlert = new MyAlert(getActivity());
        if(nameString.isEmpty()|| surnameString.isEmpty()||userString.isEmpty()||passwordString.isEmpty()) {

//            Have Space

        myAlert.normalDialog("Have Space","Please Fill Every Blank" );


        }


    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_register,menu );
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false);
    }

}
