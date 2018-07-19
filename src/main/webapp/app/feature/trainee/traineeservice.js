traineeApp.service('Data', function () {
    var self = this;
    var data = {};

    self.setData = function (trainees) {
        self.data = trainees;
    }
    self.getData = function () {
        return self.data;
    }
});