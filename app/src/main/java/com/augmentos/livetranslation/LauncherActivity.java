package com.augmentos.livetranslation;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class LauncherActivity extends AppCompatActivity {

    private static final String TAG = "LauncherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        initializeUIComponents();
    }

//    private void initializeUIComponents() {
//        Context mContext = this;

        // Spinners
//        Spinner transcribeLanguageSpinner = findViewById(R.id.transcribeLanguageSpinner);
//        Spinner sourceLanguageSpinner = findViewById(R.id.sourceLanguageSpinner);
//
//
//        // Populate Spinners with options
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
//                mContext, R.array.language_options, android.R.layout.simple_spinner_item
//        );
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        transcribeLanguageSpinner.setAdapter(adapter);
//        sourceLanguageSpinner.setAdapter(adapter);
//
//        // Set initial values and listeners for Spinners
//        setupSpinner(transcribeLanguageSpinner, mContext, "transcribeLanguage");
//        setupSpinner(sourceLanguageSpinner, mContext, "sourceLanguage");
//    }

//    private void setupSpinner(Spinner spinner, Context context, String preferenceKey) {
//        String savedValue = "";
//
//        if (preferenceKey.equals("transcribeLanguage")){
//            savedValue = getChosenTranscribeLanguage(context);
//        } else if (preferenceKey.equals("sourceLanguage")){
//            savedValue = getChosenSourceLanguage(context);
//        }
//
//        ArrayAdapter<CharSequence> adapter = (ArrayAdapter<CharSequence>) spinner.getAdapter();
//        int position = adapter.getPosition(savedValue);
//        spinner.setSelection(position);
//
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            boolean isFirstSelection = true;
//
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                if (isFirstSelection) {
//                    isFirstSelection = false;
//                    return;
//                }
//                String selectedLanguage = parent.getItemAtPosition(position).toString();
//                Log.d(TAG, preferenceKey + " updated to: " + selectedLanguage);
//                if (preferenceKey.equals("transcribeLanguage")){
//                    saveChosenTranscribeLanguage(context, selectedLanguage);
//                } else if (preferenceKey.equals("sourceLanguage")){
//                    saveChosenSourceLanguage(context, selectedLanguage);
//                }
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                // Handle case where nothing is selected (optional)
//            }
//        });
//    }

//    public static void saveChosenSourceLanguage(Context context, String sourceLanguageString) {
//        Log.d(TAG, "set saveChosenSourceLanguage");
//        PreferenceManager.getDefaultSharedPreferences(context)
//                .edit()
//                .putString(context.getResources().getString(R.string.SHARED_PREF_SOURCE_LANGUAGE), sourceLanguageString)
//                .apply();
//    }
//
//    public static void saveChosenTranscribeLanguage(Context context, String transcribeLanguageString) {
//        Log.d(TAG, "set saveChosenTranscribeLanguage");
//        PreferenceManager.getDefaultSharedPreferences(context)
//                .edit()
//                .putString(context.getResources().getString(R.string.SHARED_PREF_TRANSCRIBE_LANGUAGE), transcribeLanguageString)
//                .apply();
//    }
//
//    public static String getChosenTranscribeLanguage(Context context) {
//        String transcribeLanguageString = PreferenceManager.getDefaultSharedPreferences(context).getString(context.getResources().getString(R.string.SHARED_PREF_TRANSCRIBE_LANGUAGE), "");
//        if (transcribeLanguageString.equals("")){
//            saveChosenTranscribeLanguage(context, "Chinese");
//            transcribeLanguageString = "Chinese";
//        }
//        return transcribeLanguageString;
//    }
//
//    public static String getChosenSourceLanguage(Context context) {
//        String sourceLanguageString = PreferenceManager.getDefaultSharedPreferences(context).getString(context.getResources().getString(R.string.SHARED_PREF_SOURCE_LANGUAGE), "");
//        if (sourceLanguageString.equals("")){
//            saveChosenSourceLanguage(context, "English");
//            sourceLanguageString = "English";
//        }
//        return sourceLanguageString;
//    }

}
