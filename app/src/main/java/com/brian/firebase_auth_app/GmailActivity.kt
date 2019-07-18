package com.brian.firebase_auth_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class GmailActivity : AppCompatActivity() {

    var myWebView: WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gmail)

        myWebView =findViewById<WebView>(R.id.WebView)
        myWebView!!.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(view: WebView?,url:String): Boolean{
                view?.loadUrl(url)
                return true

            }

        }
        myWebView!!.loadUrl("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier")

    }
    }

