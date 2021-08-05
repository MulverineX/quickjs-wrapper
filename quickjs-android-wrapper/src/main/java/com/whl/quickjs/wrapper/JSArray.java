package com.whl.quickjs.wrapper;

public class JSArray extends JSObject{

    public JSArray(QuickJSContext context, long pointer) {
        super(context, pointer);
    }

    public int length() {
        return getContext().length(this);
    }

    public Object get(int index) {
        return getContext().get(this, index);
    }

}