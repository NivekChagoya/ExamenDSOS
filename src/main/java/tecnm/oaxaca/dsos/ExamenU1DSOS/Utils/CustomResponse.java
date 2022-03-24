/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnm.oaxaca.dsos.ExamenU1DSOS.Utils;

import java.util.LinkedList;

/**
 *
 * @author KEVIN CHAGOYA
 */
public class CustomResponse {

    private Integer httpCode;
    private Object data;
    private String Message;

    public CustomResponse() {
        this.httpCode = 200;
        this.data = new LinkedList();
        this.Message = "ok";
    }

    public Integer getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }
}
