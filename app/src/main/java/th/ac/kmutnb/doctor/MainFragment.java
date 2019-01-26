package th.ac.kmutnb.doctor;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Resgister controller
        resgisterController();

//        Login controllar
        loginControllar();




    }//Main Method

    private void loginControllar() {
        Button button = getView().findViewById(R.id.btnLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText userEditText = getView().findViewById(R.id.edtUesr);
                EditText passwordEditText = getView().findViewById(R.id.edtPassword);
                MyAlert myAlert = new MyAlert(getActivity());
                String user = userEditText.getText().toString().trim();
                String passwoed = passwordEditText.getText().toString().trim();

                if (user.isEmpty()||passwoed.isEmpty()) {
                    myAlert.normalDialog("Have Space","Please Fill All Ever Blank" );

                } else {

                }

            }
        });
    }

    private void resgisterController() {
        TextView textView = getView().findViewById(R.id.txtRegister);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Replace Fragment
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainFramement, new RegisterFragment()).addToBackStack(null).commit();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

}//Main Class
