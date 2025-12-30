package ksyun.client.kec.modifyrecyclebinattribute.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyRecycleBinAttributeRequest
* @Description 请求参数
*/
@Data
public class ModifyRecycleBinAttributeRequest{
    /**文件系统ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**回收站功能是否开启，默认开启*/
    @KsYunField(name="IsTrashEnable")
    private Boolean IsTrashEnable;

    /**回收站目录是否可见，默认可见*/
    @KsYunField(name="IsTrashVisible")
    private Boolean IsTrashVisible;

    /**回收站内数据保留时长，默认1天*/
    @KsYunField(name="IntervalTrash")
    private Integer IntervalTrash;

    /**回收站操作权限级别：0(只读)/1(读写)*/
    @KsYunField(name="RecycleOpPermission")
    private Integer RecycleOpPermission;

}
