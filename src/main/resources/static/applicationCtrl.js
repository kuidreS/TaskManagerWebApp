var taskApp = angular.module('taskApp', []);
taskApp.controller('ApplicationCtrl', function ($scope, $http) {

    $scope.priorities = ['HIGH','LOW','MEDIUM'];
    $scope.name = '';
    $scope.description = '';
    $scope.priority = '';
    $scope.IsHidden = true;
    $scope.searchText = '';

    $scope.loadAll = function () {
        $http.get('/getAllTasks').success(function (data) {
            $scope.tasks = data;
        });
    };
    $scope.loadAll();

    $scope.showAddTask = function() {
        $scope.IsHidden = $scope.IsHidden ? false : true;
    };

    $scope.addTask = function(name, description, priorities) {
        var task = {};
        task.name = $scope.name;
        task.description = $scope.description;
        task.priority = $scope.priority;
        task.status = 'Open';
        $http.post('/addTask', task).success(function(){
            console.log("Task was added successfully");
        });
        location.reload();
    };

});