"use strict";

(function () {


    function TraineeService (traineeDal) {

        this.getTrainees = function()
        {
            return traineeDal.getTrainees();
        };

    }

    angular.module("traineeApp").service("traineeService", ['traineeDal', TraineeService]);

}());