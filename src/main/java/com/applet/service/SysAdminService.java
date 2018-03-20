package com.applet.service;

import com.applet.entity.SysAdmin;

import java.util.List;

public interface SysAdminService {

    Boolean createAdmin(SysAdmin admin);

    Boolean deleteAdmin(SysAdmin admin);

    Boolean updateAdmin(SysAdmin admin);

    List<SysAdmin> getAdmin();
}
