package com.example.techno_shop.service;

//import com.example.techno_shop.exceptions.UserNotFoundException;
//import com.example.techno_shop.model.Role;
//import com.example.techno_shop.model.ShopUserDetails;
import com.example.techno_shop.model.Role;
import com.example.techno_shop.model.User;
//import com.example.techno_shop.repository.RoleRepository;
//import com.example.techno_shop.repository.UserRepository;
//import com.example.techno_shop.repository.UserRepository;
import com.example.techno_shop.repository.RoleRepository;
import com.example.techno_shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@Transactional
public class UserService {

//
    @Autowired
    private UserRepository userRepo;



//    public final PasswordEncoder passwordEncoder;
    @Autowired
    public RoleRepository roleRepo;
//
//    public static final int USERS_PER_PAGE = 10;
//    public final AuthorityRepository authorityRepository;

//    public User getByUsername(String username) {
//        return userRepository.getUserByUsername(username);
//    }

//    @Autowired
//    public UserService(UserRepository userRepository, RoleRepository roleRepo) {
//        this.userRepository = userRepository;
//        this.passwordEncoder = passwordEncoder;
//        this.roleRepo = roleRepo;
//    }



    public List<User> listAll(){
        return (List<User>) userRepo.findAll();
    }
//
//    public Page<User> listByPage(int pageNum, String sortField, String sortDir, String keyword) {
//        Sort sort = Sort.by(sortField);
//        sort = sortDir.equals("asc") ? sort.ascending() : sort.descending();
//        Pageable pageable = PageRequest.of(pageNum-1, USERS_PER_PAGE, sort);
//
//        if (keyword != null) {
//            return userRepository.findAll(keyword, pageable);
//        }
//        return userRepository.findAll(pageable);
//    }

    public List<Role> listRoles(){
        return (List<Role>) roleRepo.findAll();
    }

    public void save(User user){
        //?????????????????????? ???????????? ?????? ???????? ?????????? ?????? ????????????????????, ???????? ???? ???????????? ????????????, ???? ???? ?????????????????? ??????????????
//        boolean isUpdatingUser = (user.getId() != null);
//        if (isUpdatingUser){
//            User existingUser = userRepository.findById(user.getId()).get();
//            if (user.getPassword().isEmpty()){
//                user.setPassword(existingUser.getPassword());
//            }else {
//                encodePassword(user);
//            }
//        }else {
//            encodePassword(user);
//        }

        userRepo.save(user);
    }
//    private void encodePassword(User user){
//        String encodedPassword = passwordEncoder.encode(user.getPassword());
//        user.setPassword(encodedPassword);
//    }

//    public boolean isUsernameUnique(Integer id, String username){
//        User userByUsername = userRepository.getUserByUsername(username);
//        if (userByUsername == null) return true;
//        boolean isCreatingNew = (id==null);
//        if (isCreatingNew){
//            if (userByUsername != null) return false;
//        } else {
//            if(userByUsername.getId() != id) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public User get(Integer id) throws UserNotFoundException {
//        try {
//            return userRepository.findById(id).get();
//        } catch (NoSuchElementException ex){
//            throw new UserNotFoundException("???? ???????????? ???????????????????????? ?? ID: " + id);
//        }
//    }
//
//    public void delete(Integer id) throws UserNotFoundException {
//        Long countById = userRepository.countById(id);
//        if (countById == null || countById == 0) {
//            throw new UserNotFoundException("???????????????????????? ?? ID " + id + " ???? ????????????");
//        }
//
//        userRepository.deleteById(id);
//    }

//    public User updateAccount(User userInForm) {
//        User userInDB = userRepository.findById(userInForm.getId()).get();
//        if (!userInForm.getPassword().isEmpty()){
//            userInDB.setPassword(userInForm.getPassword());
//            encodePassword(userInDB);
//        }
//
//        userInDB.setFirstName(userInForm.getFirstName());
//        userInDB.setLastName(userInForm.getLastName());
//
//        return userRepository.save(userInDB);
//
//    }

}
