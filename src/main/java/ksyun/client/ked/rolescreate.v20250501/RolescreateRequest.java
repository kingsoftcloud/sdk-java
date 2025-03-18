package ksyun.client.ked.rolescreate.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname RolescreateRequest
 * @Description 请求参数
 */
@Data
public class RolescreateRequest {
    /**
     * 角色名称
     */
    @KsYunField(name = "name")
    private String Name;

    /**
     * 描述信息
     */
    @KsYunField(name = "description")
    private String Description;

    /**
     * 远程文件
     * 0: 禁用
     * 1：启用
     */
    @KsYunField(name = "fileTransfer")
    private Integer FileTransfer;

    /**
     * 共享剪贴板
     * 0: 禁用
     * 1：启用
     */
    @KsYunField(name = "clipboard")
    private Integer Clipboard;

    /**
     * 硬盘挂载
     * 0: 禁用
     * 1：启用
     */
    @KsYunField(name = "disk")
    private Integer Disk;

    /**
     * usb 挂载
     * 0: 禁用
     * 1：启用
     */
    @KsYunField(name = "usb")
    private Integer Usb;

}