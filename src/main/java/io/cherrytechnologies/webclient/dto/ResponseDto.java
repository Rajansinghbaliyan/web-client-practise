package io.cherrytechnologies.webclient.dto;

import io.cherrytechnologies.webclient.domain.Pokemon;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

public class ResponseDto<T> {
    private Date date = new Date();
    private T data;

    public ResponseDto(T data) {
        this.data = data;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
                "date=" + date +
                ", data=" + data +
                '}';
    }
}
