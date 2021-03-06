<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Trang quản lý</title>

  <!-- Custom fonts for this template-->
  <link href="/webliv/admin/layouts/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

  <!-- Page level plugin CSS-->
  <link href="/webliv/admin/layouts/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="/webliv/admin/layouts/css/sb-admin.css" rel="stylesheet">

</head>

<body id="page-top">

  <nav class="navbar navbar-expand navbar-dark bg-dark static-top">

    <a class="navbar-brand mr-1" href="index.php">Chào <?php echo $_SESSION['admin_name'] ?></a>

    <!-- Navbar Search -->
    <form class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">
      <div class="input-group">
        <input type="text" class="form-control" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
        <div class="input-group-append">
          <button class="btn btn-primary" type="button">
            <i class="fas fa-search"></i>
          </button>
        </div>
      </div>
    </form>

    <!-- Navbar -->
    <ul class="navbar-nav ml-auto ml-md-0">
      <li class="nav-item dropdown no-arrow">
        <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          <i class="fas fa-user-circle fa-fw"></i>
        </a>
        <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">
          <a class="dropdown-item" href="#">Settings</a>
          <a class="dropdown-item" href="#">Activity Log</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="/webliv/dang-xuat.php" >Logout</a>
        </div>
      </li>
    </ul>

  </nav>

  <div id="wrapper">

    <!-- Sidebar -->
    <ul class="sidebar navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="index.php">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Trang chính</span>
        </a>
      </li>
      <li class="nav-item dropdown <?php echo isset($open) && $open == 'admin' ? 'active' : '' ?>">
        <a class="nav-link" href="<?php echo modules("admin") ?>">
          <i class="fas fa-fw fa-user"></i>
          <span>Admin</span>
        </a>
      <li class=" nav-item <?php echo isset($open) && $open == 'category' ? 'active' : '' ?>">
        <a class="nav-link" href="<?php echo modules("category") ?>">
          <i class="fas fa-fw fa-table"></i>
          <span>Danh mục</span></a>
      </li>
      <li class="nav-item <?php echo isset($open) && $open == 'product' ? 'active' : '' ?>">
        <a class="nav-link" href="<?php echo modules("product") ?>">
          <i class="fas fa-fw fa-database"></i>
          <span>Sản phẩm</span></a>
      </li>
      <li class="nav-item <?php echo isset($open) && $open == 'user' ? 'active' : '' ?>"">
        <a class="nav-link" href="<?php echo modules("user") ?>">
          <i class="fas fa-fw fa-user"></i>
          <span>  Danh sách thành viên</span></a>
      </li>
      <li class="nav-item <?php echo isset($open) && $open == 'transaction' ? 'active' : '' ?>"">
        <a class="nav-link" href="<?php echo modules("transaction") ?>">
          <i class="fas fa-fw fa-table"></i>
          <span>Sản phẩm đã đặt</span></a>
      </li>
    </ul>