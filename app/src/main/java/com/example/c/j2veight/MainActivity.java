package com.example.c.j2veight;

import android.graphics.PixelFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Printer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;
import com.evgenii.jsevaluator.JsEvaluator;
import com.evgenii.jsevaluator.interfaces.JsCallback;

import trikita.anvil.RenderableView;

import static android.R.attr.name;
import static android.R.attr.width;
import static com.example.c.j2veight.R.attr.height;
import static trikita.anvil.BaseDSL.MATCH;
import static trikita.anvil.BaseDSL.WRAP;
import static trikita.anvil.BaseDSL.dip;
import static trikita.anvil.BaseDSL.o;
import static trikita.anvil.BaseDSL.padding;
import static trikita.anvil.BaseDSL.size;
import static trikita.anvil.BaseDSL.text;
import static trikita.anvil.DSL.button;
import static trikita.anvil.DSL.linearLayout;
import static trikita.anvil.DSL.onClick;
import static trikita.anvil.DSL.orientation;
import static trikita.anvil.DSL.textView;

public class MainActivity extends AppCompatActivity {

    V8 v8 = V8.createV8Runtime();

    JsEvaluator jsEvaluator;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        setContentView(new RenderableView(this) {
            @Override

            public void view() {
                o(linearLayout(),
                        orientation(LinearLayout.VERTICAL),

                        o(textView(),
                                text("...")),

                        o(button(),
                                text("..."),
                                onClick(new OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        //Toast hey;
                                        Toast hey1 = Toast.makeText(getContext(), "hey", Toast.LENGTH_LONG);
                                    }
                                })));
            }
        });


        WindowManager windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        final WindowManager.LayoutParams params = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.TYPE_PHONE,
                // WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
                WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL,
                PixelFormat.TRANSLUCENT);

        LayoutInflater li = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View mTopView = li.inflate(R.layout.videoviewlayout, null);

    }}



       // jsEvaluator.evaluate("function hello(){ return 'Hello world!'; } hello();", new JsCallback() {
       //     @Override
       //     public void onResult(final String result) {
                // get result here (optional)
         //   }
        //});




        // WindowManager wm = new




     //   String js = "var foo = function(x) {return 42 + x;}";
       // v8.executeVoidScript( js );
       V8Array parameters = new V8Array(v8).push(3);
        //int result = v8.executeIntegerFunction()

      //  int result = v8.executeIntegerFunction("foo", parameters );

     //   System.out.println(result);
     //   parameters.release();

     //   windowManager.addView(mTopView, params);


   // }




   // V8Object page = new V8Object(runtime).add("page",)






   // public static void main(String[] args) {
   //     V8 runtime = V8.createV8Runtime();

     //   V8Object result = runtime.executeObjectScript("<iframe id=\"player\" type=\"text/html\" width=\"640\" height=\"390\"\n" +
       //         "  src=\"http://www.youtube.com/embed/M7lc1UVf-VE?enablejsapi=1&origin=http://example.com\"\n" +
       //         "  frameborder=\"0\"></iframe>");
      //  int result = runtime.executeIntegerScript(""
       //         + "var hello = 'hello, ';\n"
       //         + "var world = 'world!';\n"
       //         + "hello.concat(world).length();\n");
     //   System.out.println(result);
     //   runtime.release();


















