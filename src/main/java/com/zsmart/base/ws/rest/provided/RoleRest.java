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
import com.zsmart.base.service.facade.RoleService;
import com.zsmart.base.bean.Role;
import com.zsmart.base.ws.rest.vo.RoleVo;
import com.zsmart.base.ws.rest.converter.RoleConverter;
import com.zsmart.base.service.util.* ;
@RestController
@RequestMapping("/base/Role")
@CrossOrigin(origins = {"http://localhost:4200"})
public class RoleRest {

 @Autowired 
 private RoleService roleService;

 @Autowired 
private RoleConverter roleConverter ;

@PostMapping("/")
public RoleVo save(@RequestBody RoleVo roleVo){
Role role= roleConverter.toItem(roleVo);
return roleConverter.toVo(roleService.save(role));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
roleService.deleteById(id);
}
@GetMapping("/")
public List<RoleVo> findAll(){
return roleConverter.toVo(roleService.findAll());
}

 public RoleConverter getRoleConverter(){
return roleConverter;
}
 
 public void setRoleConverter(RoleConverter roleConverter){
this.roleConverter=roleConverter;
}

 public RoleService getRoleService(){
return roleService;
}
 
 public void setRoleService(RoleService roleService){
this.roleService=roleService;
}

}