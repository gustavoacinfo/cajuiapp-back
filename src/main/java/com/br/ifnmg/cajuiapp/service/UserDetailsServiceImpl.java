package com.br.ifnmg.cajuiapp.service;

import com.br.ifnmg.cajuiapp.basico.models.Usuario;
import com.br.ifnmg.cajuiapp.basico.repository.UsuarioRepository;
import com.br.ifnmg.cajuiapp.security.UserSS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = repo.findByUsername(username);
        if (usuario == null) {
            throw new UsernameNotFoundException(username);
        }
        return new UserSS(Integer.parseInt(usuario.getId().toString()), usuario.getUsername(), usuario.getAuthKey(), usuario.getPerfis());
    }
}
