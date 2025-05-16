package ksyun.client.ked.userslist.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname UserslistRequest
 * @Description 请求参数
 */
@Data
public class UserslistRequest {
    /**
     * 每页条数
     */
    @KsYunField(name = "size")
    private Integer Size;

    /**
     * 页码数
     */
    @KsYunField(name = "page")
    private Integer Page;

}