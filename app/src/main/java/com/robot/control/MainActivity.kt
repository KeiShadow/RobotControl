package com.robot.control

import android.os.Build
import android.os.Bundle
import android.os.StrictMode
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.util.Base64
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.core.*
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.fuel.livedata.liveDataObject
import com.github.kittinunf.fuel.livedata.liveDataResponse
import com.github.kittinunf.result.Result


class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    /* lateinit var connect_btn: Button
    lateinit var left_btn : Button
    lateinit var forward_btn: Button

    val commandLeft: String = "command=1"
    val commandRight: String = "command=4"
    var isConnected = false
    private var ip_adress: String = ""
    private var user_name: String = ""
    private var password: String = ""


    var url_for_navigation =""*/


    lateinit var forwardBtn: Button
    lateinit var turnLeftBtn: Button
    lateinit var turnRightBtn: Button
    lateinit var backBtn: Button

    lateinit var rotateRightBtn: Button
    lateinit var rotateLeftBtn: Button

    var wifiCarControl = "http://192.168.1.100/wifi_car_control.cgi";

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FuelManager.instance.basePath = "http://192.168.1.100/"


        turnLeftBtn = findViewById<Button>(R.id.btnLeft)
        forwardBtn = findViewById<Button>(R.id.btnForward)
        backBtn = findViewById<Button>(R.id.btnBack)
        turnRightBtn = findViewById<Button>(R.id.btnRight)
        rotateLeftBtn =findViewById<Button>(R.id.btnRotateLeft)
        rotateRightBtn =findViewById<Button>(R.id.btnRotateRight)

        forwardBtn.setOnClickListener {
            forward();
            }
        turnLeftBtn.setOnClickListener {
                turnLeft()
            }
        turnRightBtn.setOnClickListener {
                turnRight()
            }
        backBtn.setOnClickListener {
                back()
            }

        rotateLeftBtn.setOnClickListener {
            rotateLeft()
        }

        rotateRightBtn.setOnClickListener {
            rotateRight()
        }
    }



        fun forward(){
            Fuel.get(wifiCarControl, arrayListOf("command" to 1, "param" to 10))
                .authenticate("AC13", "AC13")
                .response { request: Request, response: Response, result: Result<ByteArray, FuelError> ->
                    Log.i(TAG, "Response: $response")
                }

            Fuel.get(wifiCarControl, arrayListOf("command" to 4, "param" to 10))
                .authenticate("AC13", "AC13")
                .response { request: Request, response: Response, result: Result<ByteArray, FuelError> ->
                    Log.i(TAG, "Response: $response")
                }
        }

        fun back(){
            Fuel.get(wifiCarControl, arrayListOf("command" to 2, "param" to 10))
                .authenticate("AC13", "AC13")
                .response { request: Request, response: Response, result: Result<ByteArray, FuelError> ->
                    Log.i(TAG, "Response: $response")
                }

            Fuel.get(wifiCarControl, arrayListOf("command" to 5, "param" to 10))
                .authenticate("AC13", "AC13")
                .response { request: Request, response: Response, result: Result<ByteArray, FuelError> ->
                    Log.i(TAG, "Response: $response")
                }
        }

        fun turnLeft(){
            Fuel.get(wifiCarControl, arrayListOf("command" to 1, "param" to 10))
                .authenticate("AC13", "AC13")
                .response { request: Request, response: Response, result: Result<ByteArray, FuelError> ->
                    Log.i(TAG, "Response: $response")
                }
        }
        fun rotateLeft(){
            Fuel.get(wifiCarControl, arrayListOf("command" to 1, "param" to 5))
                .authenticate("AC13", "AC13")
                .response { request: Request, response: Response, result: Result<ByteArray, FuelError> ->
                    Log.i(TAG, "Response: $response")
                }
            Fuel.get(wifiCarControl, arrayListOf("command" to 5, "param" to 5))
                .authenticate("AC13", "AC13")
                .response { request: Request, response: Response, result: Result<ByteArray, FuelError> ->
                    Log.i(TAG, "Response: $response")
                }

        }

        fun rotateRight(){
            Fuel.get(wifiCarControl, arrayListOf("command" to 4, "param" to 5))
                .authenticate("AC13", "AC13")
                .response { request: Request, response: Response, result: Result<ByteArray, FuelError> ->
                    Log.i(TAG, "Response: $response")
                }
            Fuel.get(wifiCarControl, arrayListOf("command" to 2, "param" to 5))
                .authenticate("AC13", "AC13")
                .response { request: Request, response: Response, result: Result<ByteArray, FuelError> ->
                    Log.i(TAG, "Response: $response")
                }

        }

       fun turnRight(){
        Fuel.get(wifiCarControl, arrayListOf("command" to 4, "param" to 10))
            .authenticate("AC13", "AC13")
            .response { request: Request, response: Response, result: Result<ByteArray, FuelError> ->
                Log.i(TAG, "Response: $response")
            }

    }

    }





