var app = angular.module('aitu-project', []);

app.controller('ProductCtrl', function($scope, $http) {
    $scope.productList = [];

    $scope.getProducts = function() {
        $http({
            url: 'http://127.0.0.1:8083/api/products',
            method: "GET",
            headers: {
                "Access-Control-Allow-Origin": "*",
                "Content-Type": "application/json"
            }
        })
            .then(function (response) {
                    console.log(response);
                    $scope.productList = response.data;
                },
                function (response) { // optional
                    console.log(response);
                });
    };

    $scope.getProducts();
});