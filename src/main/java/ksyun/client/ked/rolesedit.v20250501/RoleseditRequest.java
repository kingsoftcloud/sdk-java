package ksyun.client.ked.rolesedit.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RoleseditRequest
 * @Description 请求参数
 */
@Data
public class RoleseditRequest {
    /**
     * 主键 id
     */
    @KsYunField(name = "id")
    private Integer Id;

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