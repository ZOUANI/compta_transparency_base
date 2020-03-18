package com.zsmart.base.ws.rest.provided ;


import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.zsmart.base.service.facade.AdminService;
import com.zsmart.base.bean.Admin;
import com.zsmart.base.ws.rest.vo.AdminVo;
import com.zsmart.base.ws.rest.converter.AdminConverter;
import com.zsmart.base.service.util.* ;
@RestController
@RequestMapping("/base/Admin")
@CrossOrigin(origins = {"http://localhost:4200"})
public class AdminRest {

 @Autowired 
 private AdminService adminService;

 @Autowired 
private AdminConverter adminConverter ;

@PostMapping("/")
public AdminVo save(@RequestBody AdminVo adminVo){
Admin admin= adminConverter.toItem(adminVo);
return adminConverter.toVo(adminService.save(admin));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
adminService.deleteById(id);
}
@GetMapping("/")
public List<AdminVo> findAll(){
return adminConverter.toVo(adminService.findAll());
}

 public AdminConverter getAdminConverter(){
return adminConverter;
}
 
 public void setAdminConverter(AdminConverter adminConverter){
this.adminConverter=adminConverter;
}

 public AdminService getAdminService(){
return adminService;
}
 
 public void setAdminService(AdminService adminService){
this.adminService=adminService;
}

}