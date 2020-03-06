package com.desafiolatam.casadagger;


import com.desafiolatam.casadagger.model.Casa;

import javax.inject.Inject;

import dagger.Component;


    @Component
    public interface IAppComponent {
        Casa getCasa();
    }

