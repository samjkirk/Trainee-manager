(function() {

    var TraineeController =  function(traineeService, Data, $state) {
        
    	var vm = this;

    	vm.isHidden = false;

    	vm.hideTable = function() {
    	    vm.isHidden = !vm.isHidden;
        };

        function init() {
            traineeService.getTrainees().then(function (results) {
                vm.trainees = results;
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }

    	init();

        vm.expandTrainee = function (data) {
            Data.setData(data);
            $state.go("traineedetails", { obj:  vm.selectedTrainee });
        }

        vm.selectedTrainee = Data.getData();
    };

    angular.module('traineeApp').controller('traineeController', ['traineeService', 'Data', '$state', TraineeController]);
}());